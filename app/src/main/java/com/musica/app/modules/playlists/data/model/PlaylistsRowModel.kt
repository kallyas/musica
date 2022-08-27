package com.musica.app.modules.playlists.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class PlaylistsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_likes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_270_songs)

)
