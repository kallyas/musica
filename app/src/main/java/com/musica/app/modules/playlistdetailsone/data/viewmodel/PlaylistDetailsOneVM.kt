package com.musica.app.modules.playlistdetailsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.playlistdetailsone.`data`.model.Listsongtitle3RowModel
import com.musica.app.modules.playlistdetailsone.`data`.model.PlaylistDetailsOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PlaylistDetailsOneVM : ViewModel(), KoinComponent {
  val playlistDetailsOneModel: MutableLiveData<PlaylistDetailsOneModel> =
      MutableLiveData(PlaylistDetailsOneModel())

  var navArguments: Bundle? = null

  val listsongtitleList: MutableLiveData<MutableList<Listsongtitle3RowModel>> =
      MutableLiveData(mutableListOf())
}
