package com.musica.app.modules.signup.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateYourAcc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_acc)
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
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
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
