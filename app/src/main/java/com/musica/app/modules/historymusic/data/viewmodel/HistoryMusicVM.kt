package com.musica.app.modules.historymusic.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.historymusic.`data`.model.HistoryMusicModel
import com.musica.app.modules.historymusic.`data`.model.HistoryMusicRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HistoryMusicVM : ViewModel(), KoinComponent {
  val historyMusicModel: MutableLiveData<HistoryMusicModel> = MutableLiveData(HistoryMusicModel())

  var navArguments: Bundle? = null

  val historyMusicList: MutableLiveData<MutableList<HistoryMusicRowModel>> =
      MutableLiveData(mutableListOf())
}
