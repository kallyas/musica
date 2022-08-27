package com.musica.app.modules.resetpaswordsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.resetpaswordsuccessful.`data`.model.ResetPaswordSuccessfulModel
import org.koin.core.KoinComponent

class ResetPaswordSuccessfulVM : ViewModel(), KoinComponent {
  val resetPaswordSuccessfulModel: MutableLiveData<ResetPaswordSuccessfulModel> =
      MutableLiveData(ResetPaswordSuccessfulModel())

  var navArguments: Bundle? = null
}
