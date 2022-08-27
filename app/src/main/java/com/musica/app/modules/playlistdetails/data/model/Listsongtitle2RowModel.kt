package com.musica.app.modules.playlistdetails.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class Listsongtitle2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSongTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_break_my_soul)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_beyonce)

)
