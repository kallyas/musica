package com.musica.app.modules.editprofile.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class EditProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_27_1995)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameEight: String? = MyApp.getInstance().resources.getString(R.string.msg_1_111_467_378)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGenderValue: String? = null
)
