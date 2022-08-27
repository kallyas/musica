package com.musica.app.modules.lightletsyouin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.musica.app.modules.lightletsyouin.`data`.model.LightLetsYouInModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class LightLetsYouInVM : ViewModel(), KoinComponent {
  val lightLetsYouInModel: MutableLiveData<LightLetsYouInModel> =
      MutableLiveData(LightLetsYouInModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount

  var facebookAuthResponse: JSONObject = JSONObject()
}
