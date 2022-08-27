package com.musica.app.modules.historymusic.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityHistoryMusicBinding
import com.musica.app.modules.historymusic.`data`.model.HistoryMusicRowModel
import com.musica.app.modules.historymusic.`data`.viewmodel.HistoryMusicVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HistoryMusicActivity :
    BaseActivity<ActivityHistoryMusicBinding>(R.layout.activity_history_music) {
  private val viewModel: HistoryMusicVM by viewModels<HistoryMusicVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val historyMusicAdapter =
    HistoryMusicAdapter(viewModel.historyMusicList.value?:mutableListOf())
    binding.recyclerHistoryMusic.adapter = historyMusicAdapter
    historyMusicAdapter.setOnItemClickListener(
    object : HistoryMusicAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HistoryMusicRowModel) {
        onClickRecyclerHistoryMusic(view, position, item)
      }
    }
    )
    viewModel.historyMusicList.observe(this) {
      historyMusicAdapter.updateData(it)
    }
    binding.historyMusicVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerHistoryMusic(
    view: View,
    position: Int,
    item: HistoryMusicRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HISTORY_MUSIC_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HistoryMusicActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
