package com.musica.app.modules.forgotpassword.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ListmusicRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtViaSMS: String? = MyApp.getInstance().resources.getString(R.string.lbl_via_sms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt111199: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_111_99)

)
