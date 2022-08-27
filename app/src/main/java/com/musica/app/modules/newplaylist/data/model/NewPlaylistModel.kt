package com.musica.app.modules.newplaylist.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class NewPlaylistModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPlaylist: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_playlist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTyTwoValue: String? = null
)
