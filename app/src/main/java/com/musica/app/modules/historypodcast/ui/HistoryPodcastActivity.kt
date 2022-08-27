package com.musica.app.modules.historypodcast.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityHistoryPodcastBinding
import com.musica.app.modules.historypodcast.`data`.model.Listpodcasttitle1RowModel
import com.musica.app.modules.historypodcast.`data`.viewmodel.HistoryPodcastVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HistoryPodcastActivity :
    BaseActivity<ActivityHistoryPodcastBinding>(R.layout.activity_history_podcast) {
  private val viewModel: HistoryPodcastVM by viewModels<HistoryPodcastVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listpodcasttitleAdapter =
    ListpodcasttitleAdapter(viewModel.listpodcasttitleList.value?:mutableListOf())
    binding.recyclerListpodcasttitle.adapter = listpodcasttitleAdapter
    listpodcasttitleAdapter.setOnItemClickListener(
    object : ListpodcasttitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listpodcasttitle1RowModel) {
        onClickRecyclerListpodcasttitle(view, position, item)
      }
    }
    )
    viewModel.listpodcasttitleList.observe(this) {
      listpodcasttitleAdapter.updateData(it)
    }
    binding.historyPodcastVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListpodcasttitle(
    view: View,
    position: Int,
    item: Listpodcasttitle1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HISTORY_PODCAST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HistoryPodcastActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
