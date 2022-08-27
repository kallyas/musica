package com.musica.app.modules.songsnotifications.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.songsnotifications.`data`.model.ListtodayRowModel
import com.musica.app.modules.songsnotifications.`data`.model.ListyesterdayOneRowModel
import com.musica.app.modules.songsnotifications.`data`.model.SongsNotificationsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SongsNotificationsVM : ViewModel(), KoinComponent {
  val songsNotificationsModel: MutableLiveData<SongsNotificationsModel> =
      MutableLiveData(SongsNotificationsModel())

  var navArguments: Bundle? = null

  val listtodayList: MutableLiveData<MutableList<ListtodayRowModel>> =
      MutableLiveData(mutableListOf())

  val listyesterdayOneList: MutableLiveData<MutableList<ListyesterdayOneRowModel>> =
      MutableLiveData(mutableListOf())
}
