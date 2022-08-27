package com.musica.app.modules.lightalbumdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.lightalbumdetails.`data`.model.LightAlbumDetailsModel
import com.musica.app.modules.lightalbumdetails.`data`.model.Listsongtitle1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LightAlbumDetailsVM : ViewModel(), KoinComponent {
  val lightAlbumDetailsModel: MutableLiveData<LightAlbumDetailsModel> =
      MutableLiveData(LightAlbumDetailsModel())

  var navArguments: Bundle? = null

  val listsongtitleList: MutableLiveData<MutableList<Listsongtitle1RowModel>> =
      MutableLiveData(mutableListOf())
}
