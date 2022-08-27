package com.musica.app.modules.charts.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ListpriceTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_top_albums_glob)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDolTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_top_albums_glob2)

)
