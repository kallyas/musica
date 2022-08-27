package com.musica.app.modules.lighthome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.lighthome.`data`.model.LightHomeModel
import com.musica.app.modules.lighthome.`data`.model.ListpriceRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class LightHomeVM : ViewModel(), KoinComponent {
  val lightHomeModel: MutableLiveData<LightHomeModel> = MutableLiveData(LightHomeModel())

  var navArguments: Bundle? = null

  val listpriceList: MutableLiveData<MutableList<ListpriceRowModel>> =
      MutableLiveData(mutableListOf())
}
