package com.musica.app.modules.filledotp.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.filledotp.`data`.model.FilledOtpModel
import org.koin.core.KoinComponent

class FilledOtpVM : ViewModel(), KoinComponent {
  val filledOtpModel: MutableLiveData<FilledOtpModel> = MutableLiveData(FilledOtpModel())

  var navArguments: Bundle? = null
}
