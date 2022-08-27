package com.musica.app.modules.playlistdetailsone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPlaylistDetailsOneBinding
import com.musica.app.modules.playlistdetailsone.`data`.model.Listsongtitle3RowModel
import com.musica.app.modules.playlistdetailsone.`data`.viewmodel.PlaylistDetailsOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PlaylistDetailsOneActivity :
    BaseActivity<ActivityPlaylistDetailsOneBinding>(R.layout.activity_playlist_details_one) {
  private val viewModel: PlaylistDetailsOneVM by viewModels<PlaylistDetailsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsongtitleAdapter =
    ListsongtitleAdapter(viewModel.listsongtitleList.value?:mutableListOf())
    binding.recyclerListsongtitle.adapter = listsongtitleAdapter
    listsongtitleAdapter.setOnItemClickListener(
    object : ListsongtitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listsongtitle3RowModel) {
        onClickRecyclerListsongtitle(view, position, item)
      }
    }
    )
    viewModel.listsongtitleList.observe(this) {
      listsongtitleAdapter.updateData(it)
    }
    binding.playlistDetailsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListsongtitle(
    view: View,
    position: Int,
    item: Listsongtitle3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PLAYLIST_DETAILS_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PlaylistDetailsOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
