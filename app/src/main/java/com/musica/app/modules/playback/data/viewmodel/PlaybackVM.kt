package com.musica.app.modules.playback.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.playback.`data`.model.ListallowexplicitRowModel
import com.musica.app.modules.playback.`data`.model.ListmonoaudioRowModel
import com.musica.app.modules.playback.`data`.model.PlaybackModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PlaybackVM : ViewModel(), KoinComponent {
  val playbackModel: MutableLiveData<PlaybackModel> = MutableLiveData(PlaybackModel())

  var navArguments: Bundle? = null

  val listallowexplicitList: MutableLiveData<MutableList<ListallowexplicitRowModel>> =
      MutableLiveData(mutableListOf())

  val listmonoaudioList: MutableLiveData<MutableList<ListmonoaudioRowModel>> =
      MutableLiveData(mutableListOf())
}
