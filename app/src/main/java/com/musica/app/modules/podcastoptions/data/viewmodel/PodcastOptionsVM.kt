package com.musica.app.modules.podcastoptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.podcastoptions.`data`.model.ListpodcasttitleRowModel
import com.musica.app.modules.podcastoptions.`data`.model.PodcastOptionsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PodcastOptionsVM : ViewModel(), KoinComponent {
  val podcastOptionsModel: MutableLiveData<PodcastOptionsModel> =
      MutableLiveData(PodcastOptionsModel())

  var navArguments: Bundle? = null

  val listpodcasttitleList: MutableLiveData<MutableList<ListpodcasttitleRowModel>> =
      MutableLiveData(mutableListOf())
}
