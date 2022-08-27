package com.musica.app.modules.filledotp.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class FilledOtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCodehasbeens: String? =
      MyApp.getInstance().resources.getString(R.string.msg_code_has_been_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResendcodein: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resend_code_in)

)
