package com.musica.app.modules.searchresultssongs.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.searchresultssongs.`data`.model.ListsongtitleRowModel
import com.musica.app.modules.searchresultssongs.`data`.model.SearchResultsSongsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResultsSongsVM : ViewModel(), KoinComponent {
  val searchResultsSongsModel: MutableLiveData<SearchResultsSongsModel> =
      MutableLiveData(SearchResultsSongsModel())

  var navArguments: Bundle? = null

  val listsongtitleList: MutableLiveData<MutableList<ListsongtitleRowModel>> =
      MutableLiveData(mutableListOf())
}
