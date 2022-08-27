package com.musica.app.modules.songdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.songdetails.`data`.model.SongDetailsModel
import com.musica.app.modules.songdetails.`data`.model.SongDetailsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SongDetailsVM : ViewModel(), KoinComponent {
  val songDetailsModel: MutableLiveData<SongDetailsModel> = MutableLiveData(SongDetailsModel())

  var navArguments: Bundle? = null

  val songDetailsList: MutableLiveData<MutableList<SongDetailsRowModel>> =
      MutableLiveData(mutableListOf())
}
