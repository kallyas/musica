package com.musica.app.modules.searchresultalbum.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.searchresultalbum.`data`.model.GridloremipsumdolRowModel
import com.musica.app.modules.searchresultalbum.`data`.model.SearchResultAlbumModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResultAlbumVM : ViewModel(), KoinComponent {
  val searchResultAlbumModel: MutableLiveData<SearchResultAlbumModel> =
      MutableLiveData(SearchResultAlbumModel())

  var navArguments: Bundle? = null

  val gridloremipsumdolList: MutableLiveData<MutableList<GridloremipsumdolRowModel>> =
      MutableLiveData(mutableListOf())
}
