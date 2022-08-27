package com.musica.app.modules.lyrics.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class LyricsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_03_35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_03_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLyrics: String? = MyApp.getInstance().resources.getString(R.string.lbl_lyrics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_a_nigga_bra)

)
