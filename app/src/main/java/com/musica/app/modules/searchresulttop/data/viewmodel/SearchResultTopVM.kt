package com.musica.app.modules.searchresulttop.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.searchresulttop.`data`.model.ListsongtitleTwoRowModel
import com.musica.app.modules.searchresulttop.`data`.model.SearchResultTopModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResultTopVM : ViewModel(), KoinComponent {
  val searchResultTopModel: MutableLiveData<SearchResultTopModel> =
      MutableLiveData(SearchResultTopModel())

  var navArguments: Bundle? = null

  val listsongtitleTwoList: MutableLiveData<MutableList<ListsongtitleTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
