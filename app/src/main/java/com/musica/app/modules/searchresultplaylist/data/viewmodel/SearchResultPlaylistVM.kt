package com.musica.app.modules.searchresultplaylist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.searchresultplaylist.`data`.model.GridloremipsumdolOneRowModel
import com.musica.app.modules.searchresultplaylist.`data`.model.SearchResultPlaylistModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResultPlaylistVM : ViewModel(), KoinComponent {
  val searchResultPlaylistModel: MutableLiveData<SearchResultPlaylistModel> =
      MutableLiveData(SearchResultPlaylistModel())

  var navArguments: Bundle? = null

  val gridloremipsumdolOneList: MutableLiveData<MutableList<GridloremipsumdolOneRowModel>> =
      MutableLiveData(mutableListOf())
}
