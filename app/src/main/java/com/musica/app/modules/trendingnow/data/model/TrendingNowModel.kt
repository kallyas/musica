package com.musica.app.modules.trendingnow.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class TrendingNowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_trending_now)

)
