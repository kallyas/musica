package com.musica.app.modules.newplaylist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.newplaylist.`data`.model.NewPlaylistModel
import org.koin.core.KoinComponent

class NewPlaylistVM : ViewModel(), KoinComponent {
  val newPlaylistModel: MutableLiveData<NewPlaylistModel> = MutableLiveData(NewPlaylistModel())

  var navArguments: Bundle? = null
}
