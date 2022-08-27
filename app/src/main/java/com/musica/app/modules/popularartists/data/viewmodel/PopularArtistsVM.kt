package com.musica.app.modules.popularartists.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.popularartists.`data`.model.GridartistsnameRowModel
import com.musica.app.modules.popularartists.`data`.model.PopularArtistsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PopularArtistsVM : ViewModel(), KoinComponent {
  val popularArtistsModel: MutableLiveData<PopularArtistsModel> =
      MutableLiveData(PopularArtistsModel())

  var navArguments: Bundle? = null

  val gridartistsnameList: MutableLiveData<MutableList<GridartistsnameRowModel>> =
      MutableLiveData(mutableListOf())
}
