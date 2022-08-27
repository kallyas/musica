package com.musica.app.modules.lightletsyouin.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class LightLetsYouInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsyouin: String? = MyApp.getInstance().resources.getString(R.string.lbl_let_s_you_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinuewithF: String? =
      MyApp.getInstance().resources.getString(R.string.msg_continue_with_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinuewithG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_continue_with_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinuewithA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_continue_with_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
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

)
