package com.musica.app.modules.playlistdetailsone.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class Listsongtitle3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSongTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_starboy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetails: String? = MyApp.getInstance().resources.getString(R.string.msg_the_weeknd_daf)

)
