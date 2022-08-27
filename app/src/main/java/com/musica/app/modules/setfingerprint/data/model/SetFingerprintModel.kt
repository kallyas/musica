package com.musica.app.modules.setfingerprint.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SetFingerprintModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSetYourFinger: String? =
      MyApp.getInstance().resources.getString(R.string.msg_set_your_finger)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddafingerpri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_a_fingerpri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseputyour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_put_your)

)
