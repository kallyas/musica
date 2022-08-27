package com.musica.app.modules.signin.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogintoYourA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_your_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotthepass: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_the_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinuewit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusDefaultValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusDefaultOneValue: String? = null
)
