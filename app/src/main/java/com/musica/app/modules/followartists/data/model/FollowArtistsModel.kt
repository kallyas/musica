package com.musica.app.modules.followartists.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class FollowArtistsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowArtists: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_follow_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowyourfav: String? =
      MyApp.getInstance().resources.getString(R.string.msg_follow_your_fav)

)
