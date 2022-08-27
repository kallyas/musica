package com.musica.app.modules.summaryone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.summaryone.`data`.model.SummaryOneModel
import org.koin.core.KoinComponent

class SummaryOneVM : ViewModel(), KoinComponent {
  val summaryOneModel: MutableLiveData<SummaryOneModel> = MutableLiveData(SummaryOneModel())

  var navArguments: Bundle? = null
}
