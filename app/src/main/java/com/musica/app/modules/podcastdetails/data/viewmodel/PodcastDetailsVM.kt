package com.musica.app.modules.podcastdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.podcastdetails.`data`.model.Listpodcasttitle3RowModel
import com.musica.app.modules.podcastdetails.`data`.model.PodcastDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PodcastDetailsVM : ViewModel(), KoinComponent {
  val podcastDetailsModel: MutableLiveData<PodcastDetailsModel> =
      MutableLiveData(PodcastDetailsModel())

  var navArguments: Bundle? = null

  val listpodcasttitleList: MutableLiveData<MutableList<Listpodcasttitle3RowModel>> =
      MutableLiveData(mutableListOf())
}
