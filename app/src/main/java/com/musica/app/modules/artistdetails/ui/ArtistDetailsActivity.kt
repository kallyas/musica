package com.musica.app.modules.artistdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityArtistDetailsBinding
import com.musica.app.modules.artistdetails.`data`.model.ArtistDetailsRowModel
import com.musica.app.modules.artistdetails.`data`.viewmodel.ArtistDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ArtistDetailsActivity :
    BaseActivity<ActivityArtistDetailsBinding>(R.layout.activity_artist_details) {
  private val viewModel: ArtistDetailsVM by viewModels<ArtistDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val artistDetailsAdapter =
    ArtistDetailsAdapter(viewModel.artistDetailsList.value?:mutableListOf())
    binding.recyclerArtistDetails.adapter = artistDetailsAdapter
    artistDetailsAdapter.setOnItemClickListener(
    object : ArtistDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ArtistDetailsRowModel) {
        onClickRecyclerArtistDetails(view, position, item)
      }
    }
    )
    viewModel.artistDetailsList.observe(this) {
      artistDetailsAdapter.updateData(it)
    }
    binding.artistDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerArtistDetails(
    view: View,
    position: Int,
    item: ArtistDetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ARTIST_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ArtistDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
