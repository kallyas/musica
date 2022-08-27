package com.musica.app.modules.playback.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPlaybackBinding
import com.musica.app.modules.playback.`data`.model.ListallowexplicitRowModel
import com.musica.app.modules.playback.`data`.model.ListmonoaudioRowModel
import com.musica.app.modules.playback.`data`.viewmodel.PlaybackVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PlaybackActivity : BaseActivity<ActivityPlaybackBinding>(R.layout.activity_playback) {
  private val viewModel: PlaybackVM by viewModels<PlaybackVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listallowexplicitAdapter =
    ListallowexplicitAdapter(viewModel.listallowexplicitList.value?:mutableListOf())
    binding.recyclerListallowexplicit.adapter = listallowexplicitAdapter
    listallowexplicitAdapter.setOnItemClickListener(
    object : ListallowexplicitAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListallowexplicitRowModel) {
        onClickRecyclerListallowexplicit(view, position, item)
      }
    }
    )
    viewModel.listallowexplicitList.observe(this) {
      listallowexplicitAdapter.updateData(it)
    }
    val listmonoaudioAdapter =
    ListmonoaudioAdapter(viewModel.listmonoaudioList.value?:mutableListOf())
    binding.recyclerListmonoaudio.adapter = listmonoaudioAdapter
    listmonoaudioAdapter.setOnItemClickListener(
    object : ListmonoaudioAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmonoaudioRowModel) {
        onClickRecyclerListmonoaudio(view, position, item)
      }
    }
    )
    viewModel.listmonoaudioList.observe(this) {
      listmonoaudioAdapter.updateData(it)
    }
    binding.playbackVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListallowexplicit(
    view: View,
    position: Int,
    item: ListallowexplicitRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListmonoaudio(
    view: View,
    position: Int,
    item: ListmonoaudioRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PLAYBACK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PlaybackActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
