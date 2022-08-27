package com.musica.app.modules.songsnotifications.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySongsNotificationsBinding
import com.musica.app.modules.songsnotifications.`data`.model.ListtodayRowModel
import com.musica.app.modules.songsnotifications.`data`.model.ListyesterdayOneRowModel
import com.musica.app.modules.songsnotifications.`data`.viewmodel.SongsNotificationsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SongsNotificationsActivity :
    BaseActivity<ActivitySongsNotificationsBinding>(R.layout.activity_songs_notifications) {
  private val viewModel: SongsNotificationsVM by viewModels<SongsNotificationsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listtodayAdapter = ListtodayAdapter(viewModel.listtodayList.value?:mutableListOf())
    binding.recyclerListtoday.adapter = listtodayAdapter
    listtodayAdapter.setOnItemClickListener(
    object : ListtodayAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListtodayRowModel) {
        onClickRecyclerListtoday(view, position, item)
      }
    }
    )
    viewModel.listtodayList.observe(this) {
      listtodayAdapter.updateData(it)
    }
    val listyesterdayOneAdapter =
    ListyesterdayOneAdapter(viewModel.listyesterdayOneList.value?:mutableListOf())
    binding.recyclerListyesterdayOne.adapter = listyesterdayOneAdapter
    listyesterdayOneAdapter.setOnItemClickListener(
    object : ListyesterdayOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListyesterdayOneRowModel) {
        onClickRecyclerListyesterdayOne(view, position, item)
      }
    }
    )
    viewModel.listyesterdayOneList.observe(this) {
      listyesterdayOneAdapter.updateData(it)
    }
    binding.songsNotificationsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListtoday(
    view: View,
    position: Int,
    item: ListtodayRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListyesterdayOne(
    view: View,
    position: Int,
    item: ListyesterdayOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SONGS_NOTIFICATIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SongsNotificationsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
