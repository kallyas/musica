package com.musica.app.modules.artists.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityArtistsBinding
import com.musica.app.modules.artists.`data`.model.ArtistsRowModel
import com.musica.app.modules.artists.`data`.viewmodel.ArtistsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ArtistsActivity : BaseActivity<ActivityArtistsBinding>(R.layout.activity_artists) {
  private val viewModel: ArtistsVM by viewModels<ArtistsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val artistsAdapter = ArtistsAdapter(viewModel.artistsList.value?:mutableListOf())
    binding.recyclerArtists.adapter = artistsAdapter
    artistsAdapter.setOnItemClickListener(
    object : ArtistsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ArtistsRowModel) {
        onClickRecyclerArtists(view, position, item)
      }
    }
    )
    viewModel.artistsList.observe(this) {
      artistsAdapter.updateData(it)
    }
    binding.artistsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerArtists(
    view: View,
    position: Int,
    item: ArtistsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ARTISTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ArtistsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
