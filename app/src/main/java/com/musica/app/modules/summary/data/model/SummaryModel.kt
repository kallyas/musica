package com.musica.app.modules.summary.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SummaryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtModalTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_you_have_succes)

)
