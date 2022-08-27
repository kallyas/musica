package com.musica.app.modules.songplayoverscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.songplayoverscreen.`data`.model.Listsongtitle4RowModel
import com.musica.app.modules.songplayoverscreen.`data`.model.SongPlayOverScreenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SongPlayOverScreenVM : ViewModel(), KoinComponent {
  val songPlayOverScreenModel: MutableLiveData<SongPlayOverScreenModel> =
      MutableLiveData(SongPlayOverScreenModel())

  var navArguments: Bundle? = null

  val listsongtitleList: MutableLiveData<MutableList<Listsongtitle4RowModel>> =
      MutableLiveData(mutableListOf())
}
