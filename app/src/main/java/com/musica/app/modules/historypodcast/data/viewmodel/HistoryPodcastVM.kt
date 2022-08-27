package com.musica.app.modules.historypodcast.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.historypodcast.`data`.model.HistoryPodcastModel
import com.musica.app.modules.historypodcast.`data`.model.Listpodcasttitle1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HistoryPodcastVM : ViewModel(), KoinComponent {
  val historyPodcastModel: MutableLiveData<HistoryPodcastModel> =
      MutableLiveData(HistoryPodcastModel())

  var navArguments: Bundle? = null

  val listpodcasttitleList: MutableLiveData<MutableList<Listpodcasttitle1RowModel>> =
      MutableLiveData(mutableListOf())
}
