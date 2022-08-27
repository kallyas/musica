package com.musica.app.modules.downloadsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.downloadsone.`data`.model.DownloadsOneModel
import com.musica.app.modules.downloadsone.`data`.model.DownloadsOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DownloadsOneVM : ViewModel(), KoinComponent {
  val downloadsOneModel: MutableLiveData<DownloadsOneModel> = MutableLiveData(DownloadsOneModel())

  var navArguments: Bundle? = null

  val downloadsOneList: MutableLiveData<MutableList<DownloadsOneRowModel>> =
      MutableLiveData(mutableListOf())
}
