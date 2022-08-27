package com.musica.app.modules.searchresiltprofile1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.searchresiltprofile1.`data`.model.SearchResiltProfile1Model
import org.koin.core.KoinComponent

class SearchResiltProfile1VM : ViewModel(), KoinComponent {
  val searchResiltProfile1Model: MutableLiveData<SearchResiltProfile1Model> =
      MutableLiveData(SearchResiltProfile1Model())

  var navArguments: Bundle? = null
}
