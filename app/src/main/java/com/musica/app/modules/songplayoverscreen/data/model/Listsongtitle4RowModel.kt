package com.musica.app.modules.songplayoverscreen.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class Listsongtitle4RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSongTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_starboy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheWeekndDaf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_weeknd_daf)

)