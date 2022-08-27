package com.musica.app.modules.splash.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTunecast: String? = MyApp.getInstance().resources.getString(R.string.lbl_tunecast)

)
