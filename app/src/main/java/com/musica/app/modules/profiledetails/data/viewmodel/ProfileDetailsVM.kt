package com.musica.app.modules.profiledetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.profiledetails.`data`.model.ProfileDetailsModel
import org.koin.core.KoinComponent

class ProfileDetailsVM : ViewModel(), KoinComponent {
  val profileDetailsModel: MutableLiveData<ProfileDetailsModel> =
      MutableLiveData(ProfileDetailsModel())

  var navArguments: Bundle? = null
}
