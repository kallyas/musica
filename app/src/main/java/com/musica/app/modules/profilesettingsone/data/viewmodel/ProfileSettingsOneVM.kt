package com.musica.app.modules.profilesettingsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.profilesettingsone.`data`.model.ProfileSettingsOneModel
import org.koin.core.KoinComponent

class ProfileSettingsOneVM : ViewModel(), KoinComponent {
  val profileSettingsOneModel: MutableLiveData<ProfileSettingsOneModel> =
      MutableLiveData(ProfileSettingsOneModel())

  var navArguments: Bundle? = null
}
