package com.musica.app.modules.resetpaswordsuccessful.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPaswordSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_account_is)

)
