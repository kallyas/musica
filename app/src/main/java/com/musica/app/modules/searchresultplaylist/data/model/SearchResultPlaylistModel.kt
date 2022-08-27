package com.musica.app.modules.searchresultplaylist.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultPlaylistModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_ariana_grande)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ariana_grande2)

)
