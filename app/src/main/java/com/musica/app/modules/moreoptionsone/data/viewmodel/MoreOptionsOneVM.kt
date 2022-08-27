package com.musica.app.modules.moreoptionsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.moreoptionsone.`data`.model.Listsongtitle5RowModel
import com.musica.app.modules.moreoptionsone.`data`.model.MoreOptionsOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MoreOptionsOneVM : ViewModel(), KoinComponent {
  val moreOptionsOneModel: MutableLiveData<MoreOptionsOneModel> =
      MutableLiveData(MoreOptionsOneModel())

  var navArguments: Bundle? = null

  val listsongtitleList: MutableLiveData<MutableList<Listsongtitle5RowModel>> =
      MutableLiveData(mutableListOf())
}
