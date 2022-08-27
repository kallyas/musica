package com.musica.app.modules.moreoptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.moreoptions.`data`.model.MoreOptionsModel
import com.musica.app.modules.moreoptions.`data`.model.MoreOptionsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MoreOptionsVM : ViewModel(), KoinComponent {
  val moreOptionsModel: MutableLiveData<MoreOptionsModel> = MutableLiveData(MoreOptionsModel())

  var navArguments: Bundle? = null

  val moreOptionsList: MutableLiveData<MutableList<MoreOptionsRowModel>> =
      MutableLiveData(mutableListOf())
}
