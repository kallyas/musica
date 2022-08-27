package com.musica.app.modules.songs.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySongsBinding
import com.musica.app.modules.songs.`data`.model.SongsRowModel
import com.musica.app.modules.songs.`data`.viewmodel.SongsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SongsActivity : BaseActivity<ActivitySongsBinding>(R.layout.activity_songs) {
  private val viewModel: SongsVM by viewModels<SongsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val songsAdapter = SongsAdapter(viewModel.songsList.value?:mutableListOf())
    binding.recyclerSongs.adapter = songsAdapter
    songsAdapter.setOnItemClickListener(
    object : SongsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SongsRowModel) {
        onClickRecyclerSongs(view, position, item)
      }
    }
    )
    viewModel.songsList.observe(this) {
      songsAdapter.updateData(it)
    }
    binding.songsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSongs(
    view: View,
    position: Int,
    item: SongsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SONGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SongsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
