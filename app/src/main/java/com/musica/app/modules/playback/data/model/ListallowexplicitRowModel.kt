package com.musica.app.modules.playback.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ListallowexplicitRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowExplicit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_allow_explicit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTurnonplayex: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_on_play_ex)

)
