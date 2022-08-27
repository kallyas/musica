package com.musica.app.modules.podcastsnotifications.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.podcastsnotifications.`data`.model.Listpodcasttitle4RowModel
import com.musica.app.modules.podcastsnotifications.`data`.model.ListpodcasttitleThreeRowModel
import com.musica.app.modules.podcastsnotifications.`data`.model.PodcastsNotificationsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PodcastsNotificationsVM : ViewModel(), KoinComponent {
  val podcastsNotificationsModel: MutableLiveData<PodcastsNotificationsModel> =
      MutableLiveData(PodcastsNotificationsModel())

  var navArguments: Bundle? = null

  val listpodcasttitleList: MutableLiveData<MutableList<Listpodcasttitle4RowModel>> =
      MutableLiveData(mutableListOf())

  val listpodcasttitleThreeList: MutableLiveData<MutableList<ListpodcasttitleThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
