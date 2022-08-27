package com.musica.app.modules.lightwalkthrough.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class LightWalkthroughModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtListentotheb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_listen_to_the_b)

)
