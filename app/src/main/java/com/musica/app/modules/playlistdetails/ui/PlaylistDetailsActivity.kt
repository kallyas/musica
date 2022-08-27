package com.musica.app.modules.playlistdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPlaylistDetailsBinding
import com.musica.app.modules.playlistdetails.`data`.model.Listsongtitle2RowModel
import com.musica.app.modules.playlistdetails.`data`.viewmodel.PlaylistDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PlaylistDetailsActivity :
    BaseActivity<ActivityPlaylistDetailsBinding>(R.layout.activity_playlist_details) {
  private val viewModel: PlaylistDetailsVM by viewModels<PlaylistDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsongtitleAdapter =
    ListsongtitleAdapter(viewModel.listsongtitleList.value?:mutableListOf())
    binding.recyclerListsongtitle.adapter = listsongtitleAdapter
    listsongtitleAdapter.setOnItemClickListener(
    object : ListsongtitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listsongtitle2RowModel) {
        onClickRecyclerListsongtitle(view, position, item)
      }
    }
    )
    viewModel.listsongtitleList.observe(this) {
      listsongtitleAdapter.updateData(it)
    }
    binding.playlistDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListsongtitle(
    view: View,
    position: Int,
    item: Listsongtitle2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PLAYLIST_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PlaylistDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
