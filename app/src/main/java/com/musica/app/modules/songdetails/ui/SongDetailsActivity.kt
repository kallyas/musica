package com.musica.app.modules.songdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySongDetailsBinding
import com.musica.app.modules.songdetails.`data`.model.SongDetailsRowModel
import com.musica.app.modules.songdetails.`data`.viewmodel.SongDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SongDetailsActivity : BaseActivity<ActivitySongDetailsBinding>(R.layout.activity_song_details)
    {
  private val viewModel: SongDetailsVM by viewModels<SongDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val songDetailsAdapter =
    SongDetailsAdapter(viewModel.songDetailsList.value?:mutableListOf())
    binding.recyclerSongDetails.adapter = songDetailsAdapter
    songDetailsAdapter.setOnItemClickListener(
    object : SongDetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SongDetailsRowModel) {
        onClickRecyclerSongDetails(view, position, item)
      }
    }
    )
    viewModel.songDetailsList.observe(this) {
      songDetailsAdapter.updateData(it)
    }
    binding.songDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSongDetails(
    view: View,
    position: Int,
    item: SongDetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SONG_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SongDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
