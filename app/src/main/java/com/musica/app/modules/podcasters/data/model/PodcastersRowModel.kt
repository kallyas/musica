package com.musica.app.modules.podcasters.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class PodcastersRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_the_jordan_harb3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEpisodesCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_692_episodes)

)
