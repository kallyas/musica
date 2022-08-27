package com.musica.app.modules.searchresultpodcast.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.searchresultpodcast.`data`.model.Listpodcasttitle2RowModel
import com.musica.app.modules.searchresultpodcast.`data`.model.SearchResultPodcastModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResultPodcastVM : ViewModel(), KoinComponent {
  val searchResultPodcastModel: MutableLiveData<SearchResultPodcastModel> =
      MutableLiveData(SearchResultPodcastModel())

  var navArguments: Bundle? = null

  val listpodcasttitleList: MutableLiveData<MutableList<Listpodcasttitle2RowModel>> =
      MutableLiveData(mutableListOf())
}
