package com.musica.app.modules.createnewpin.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class CreateNewPinModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNewPIN: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_new_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddaPINnumbe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_a_pin_numbe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStatusFillTy: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStatusFillTyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStatusActive: String? = MyApp.getInstance().resources.getString(R.string.lbl_7)

)
