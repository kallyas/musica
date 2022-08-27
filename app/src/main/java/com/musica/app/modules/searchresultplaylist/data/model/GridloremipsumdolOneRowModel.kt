package com.musica.app.modules.searchresultplaylist.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class GridloremipsumdolOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDolOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ariana_grande3)

)
