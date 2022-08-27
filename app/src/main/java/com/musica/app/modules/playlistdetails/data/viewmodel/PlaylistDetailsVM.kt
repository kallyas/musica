package com.musica.app.modules.playlistdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.playlistdetails.`data`.model.Listsongtitle2RowModel
import com.musica.app.modules.playlistdetails.`data`.model.PlaylistDetailsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PlaylistDetailsVM : ViewModel(), KoinComponent {
  val playlistDetailsModel: MutableLiveData<PlaylistDetailsModel> =
      MutableLiveData(PlaylistDetailsModel())

  var navArguments: Bundle? = null

  val listsongtitleList: MutableLiveData<MutableList<Listsongtitle2RowModel>> =
      MutableLiveData(mutableListOf())
}
