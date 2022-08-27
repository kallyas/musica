package com.musica.app.modules.charts.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class Listprice1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_top_albums_glob)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_top_albums_glob2)

)
