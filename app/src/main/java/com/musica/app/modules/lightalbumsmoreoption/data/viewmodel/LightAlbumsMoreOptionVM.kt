package com.musica.app.modules.lightalbumsmoreoption.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.lightalbumsmoreoption.`data`.model.LightAlbumsMoreOptionModel
import com.musica.app.modules.lightalbumsmoreoption.`data`.model.ListloremipsumRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LightAlbumsMoreOptionVM : ViewModel(), KoinComponent {
  val lightAlbumsMoreOptionModel: MutableLiveData<LightAlbumsMoreOptionModel> =
      MutableLiveData(LightAlbumsMoreOptionModel())

  var navArguments: Bundle? = null

  val listloremipsumList: MutableLiveData<MutableList<ListloremipsumRowModel>> =
      MutableLiveData(mutableListOf())
}
