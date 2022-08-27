package com.musica.app.modules.profiledetailsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.profiledetailsone.`data`.model.ProfileDetailsOneModel
import org.koin.core.KoinComponent

class ProfileDetailsOneVM : ViewModel(), KoinComponent {
  val profileDetailsOneModel: MutableLiveData<ProfileDetailsOneModel> =
      MutableLiveData(ProfileDetailsOneModel())

  var navArguments: Bundle? = null
}
