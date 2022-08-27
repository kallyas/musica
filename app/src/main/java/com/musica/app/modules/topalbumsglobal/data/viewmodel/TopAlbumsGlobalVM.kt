package com.musica.app.modules.topalbumsglobal.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.topalbumsglobal.`data`.model.ListzeroRowModel
import com.musica.app.modules.topalbumsglobal.`data`.model.TopAlbumsGlobalModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TopAlbumsGlobalVM : ViewModel(), KoinComponent {
  val topAlbumsGlobalModel: MutableLiveData<TopAlbumsGlobalModel> =
      MutableLiveData(TopAlbumsGlobalModel())

  var navArguments: Bundle? = null

  val listzeroList: MutableLiveData<MutableList<ListzeroRowModel>> =
      MutableLiveData(mutableListOf())
}
