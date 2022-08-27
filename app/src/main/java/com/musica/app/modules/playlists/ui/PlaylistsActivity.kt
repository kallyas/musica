package com.musica.app.modules.playlists.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPlaylistsBinding
import com.musica.app.modules.playlists.`data`.model.PlaylistsRowModel
import com.musica.app.modules.playlists.`data`.viewmodel.PlaylistsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PlaylistsActivity : BaseActivity<ActivityPlaylistsBinding>(R.layout.activity_playlists) {
  private val viewModel: PlaylistsVM by viewModels<PlaylistsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val playlistsAdapter = PlaylistsAdapter(viewModel.playlistsList.value?:mutableListOf())
    binding.recyclerPlaylists.adapter = playlistsAdapter
    playlistsAdapter.setOnItemClickListener(
    object : PlaylistsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PlaylistsRowModel) {
        onClickRecyclerPlaylists(view, position, item)
      }
    }
    )
    viewModel.playlistsList.observe(this) {
      playlistsAdapter.updateData(it)
    }
    binding.playlistsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerPlaylists(
    view: View,
    position: Int,
    item: PlaylistsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PLAYLISTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PlaylistsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
