package com.musica.app.modules.topalbumsglobal.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class TopAlbumsGlobalModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtistsName: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_most_played)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.msg_by_hearme_12)

)
