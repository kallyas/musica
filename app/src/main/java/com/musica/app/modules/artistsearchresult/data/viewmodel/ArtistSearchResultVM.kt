package com.musica.app.modules.artistsearchresult.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.artistsearchresult.`data`.model.ArtistSearchResultModel
import com.musica.app.modules.artistsearchresult.`data`.model.ListellipseoneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ArtistSearchResultVM : ViewModel(), KoinComponent {
  val artistSearchResultModel: MutableLiveData<ArtistSearchResultModel> =
      MutableLiveData(ArtistSearchResultModel())

  var navArguments: Bundle? = null

  val listellipseoneList: MutableLiveData<MutableList<ListellipseoneRowModel>> =
      MutableLiveData(mutableListOf())
}
