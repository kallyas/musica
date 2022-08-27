package com.musica.app.modules.security.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SecurityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSecurity: String? = MyApp.getInstance().resources.getString(R.string.lbl_security)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRememberme: String? = MyApp.getInstance().resources.getString(R.string.lbl_remember_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFaceID: String? = MyApp.getInstance().resources.getString(R.string.lbl_face_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBiometricID: String? = MyApp.getInstance().resources.getString(R.string.lbl_biometric_id)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoogleAuthenti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_google_authenti)

)
