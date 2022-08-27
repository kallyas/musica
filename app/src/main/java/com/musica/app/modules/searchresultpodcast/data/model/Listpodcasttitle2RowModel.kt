package com.musica.app.modules.searchresultpodcast.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class Listpodcasttitle2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcastTitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_837_tristan_ha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAuthor: String? = MyApp.getInstance().resources.getString(R.string.lbl_apple_talk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirtyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_48_26_mins)

)
