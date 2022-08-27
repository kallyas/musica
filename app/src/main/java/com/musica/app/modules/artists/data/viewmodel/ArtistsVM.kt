package com.musica.app.modules.artists.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.artists.`data`.model.ArtistsModel
import com.musica.app.modules.artists.`data`.model.ArtistsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ArtistsVM : ViewModel(), KoinComponent {
  val artistsModel: MutableLiveData<ArtistsModel> = MutableLiveData(ArtistsModel())

  var navArguments: Bundle? = null

  val artistsList: MutableLiveData<MutableList<ArtistsRowModel>> = MutableLiveData(mutableListOf())
}
