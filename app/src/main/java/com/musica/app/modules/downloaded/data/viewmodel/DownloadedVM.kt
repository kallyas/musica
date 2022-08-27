package com.musica.app.modules.downloaded.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.downloaded.`data`.model.DownloadedModel
import com.musica.app.modules.downloaded.`data`.model.DownloadedRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DownloadedVM : ViewModel(), KoinComponent {
  val downloadedModel: MutableLiveData<DownloadedModel> = MutableLiveData(DownloadedModel())

  var navArguments: Bundle? = null

  val downloadedList: MutableLiveData<MutableList<DownloadedRowModel>> =
      MutableLiveData(mutableListOf())
}
