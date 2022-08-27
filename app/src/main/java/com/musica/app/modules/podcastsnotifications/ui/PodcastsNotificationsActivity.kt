package com.musica.app.modules.podcastsnotifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPodcastsNotificationsBinding
import com.musica.app.modules.podcastsnotifications.`data`.model.Listpodcasttitle4RowModel
import com.musica.app.modules.podcastsnotifications.`data`.model.ListpodcasttitleThreeRowModel
import com.musica.app.modules.podcastsnotifications.`data`.viewmodel.PodcastsNotificationsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PodcastsNotificationsActivity :
    BaseActivity<ActivityPodcastsNotificationsBinding>(R.layout.activity_podcasts_notifications) {
  private val viewModel: PodcastsNotificationsVM by viewModels<PodcastsNotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listpodcasttitleAdapter =
    ListpodcasttitleAdapter(viewModel.listpodcasttitleList.value?:mutableListOf())
    binding.recyclerListpodcasttitle.adapter = listpodcasttitleAdapter
    listpodcasttitleAdapter.setOnItemClickListener(
    object : ListpodcasttitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listpodcasttitle4RowModel) {
        onClickRecyclerListpodcasttitle(view, position, item)
      }
    }
    )
    viewModel.listpodcasttitleList.observe(this) {
      listpodcasttitleAdapter.updateData(it)
    }
    val listpodcasttitleThreeAdapter =
    ListpodcasttitleThreeAdapter(viewModel.listpodcasttitleThreeList.value?:mutableListOf())
    binding.recyclerListpodcasttitleThree.adapter = listpodcasttitleThreeAdapter
    listpodcasttitleThreeAdapter.setOnItemClickListener(
    object : ListpodcasttitleThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListpodcasttitleThreeRowModel) {
        onClickRecyclerListpodcasttitleThree(view, position, item)
      }
    }
    )
    viewModel.listpodcasttitleThreeList.observe(this) {
      listpodcasttitleThreeAdapter.updateData(it)
    }
    binding.podcastsNotificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListpodcasttitle(
    view: View,
    position: Int,
    item: Listpodcasttitle4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListpodcasttitleThree(
    view: View,
    position: Int,
    item: ListpodcasttitleThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PODCASTS_NOTIFICATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PodcastsNotificationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
