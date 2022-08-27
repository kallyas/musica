package com.musica.app.modules.searchresiltprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.searchresiltprofile.`data`.model.ListprofilenameRowModel
import com.musica.app.modules.searchresiltprofile.`data`.model.SearchResiltProfileModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchResiltProfileVM : ViewModel(), KoinComponent {
  val searchResiltProfileModel: MutableLiveData<SearchResiltProfileModel> =
      MutableLiveData(SearchResiltProfileModel())

  var navArguments: Bundle? = null

  val listprofilenameList: MutableLiveData<MutableList<ListprofilenameRowModel>> =
      MutableLiveData(mutableListOf())
}
