package com.musica.app.modules.lightwalkthrough.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.lightwalkthrough.`data`.model.LightWalkthroughModel
import org.koin.core.KoinComponent

class LightWalkthroughVM : ViewModel(), KoinComponent {
  val lightWalkthroughModel: MutableLiveData<LightWalkthroughModel> =
      MutableLiveData(LightWalkthroughModel())

  var navArguments: Bundle? = null
}
