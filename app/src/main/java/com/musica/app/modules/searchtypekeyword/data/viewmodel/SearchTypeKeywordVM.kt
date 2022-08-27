package com.musica.app.modules.searchtypekeyword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.searchtypekeyword.`data`.model.SearchTypeKeywordModel
import org.koin.core.KoinComponent

class SearchTypeKeywordVM : ViewModel(), KoinComponent {
  val searchTypeKeywordModel: MutableLiveData<SearchTypeKeywordModel> =
      MutableLiveData(SearchTypeKeywordModel())

  var navArguments: Bundle? = null
}
