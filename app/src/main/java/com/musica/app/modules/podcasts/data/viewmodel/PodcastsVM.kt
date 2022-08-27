package com.musica.app.modules.podcasts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.podcasts.`data`.model.PodcastsModel
import com.musica.app.modules.podcasts.`data`.model.PodcastsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PodcastsVM : ViewModel(), KoinComponent {
  val podcastsModel: MutableLiveData<PodcastsModel> = MutableLiveData(PodcastsModel())

  var navArguments: Bundle? = null

  val podcastsList: MutableLiveData<MutableList<PodcastsRowModel>> =
      MutableLiveData(mutableListOf())
}
