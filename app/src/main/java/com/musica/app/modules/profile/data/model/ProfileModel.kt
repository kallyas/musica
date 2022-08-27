package com.musica.app.modules.profile.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFillYourProfi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fill_your_profi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusDefaultValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusDefaultOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusDefaultTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameSevenValue: String? = null
)
