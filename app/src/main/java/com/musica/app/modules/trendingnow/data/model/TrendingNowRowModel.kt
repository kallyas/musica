package com.musica.app.modules.trendingnow.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class TrendingNowRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shades_of_love)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDolOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_without_you_t)

)
