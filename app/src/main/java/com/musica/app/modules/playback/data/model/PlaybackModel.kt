package com.musica.app.modules.playback.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class PlaybackModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlayback: String? = MyApp.getInstance().resources.getString(R.string.lbl_playback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGapless: String? = MyApp.getInstance().resources.getString(R.string.lbl_gapless)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowsgapless: String? =
      MyApp.getInstance().resources.getString(R.string.msg_allows_gapless)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAutomix: String? = MyApp.getInstance().resources.getString(R.string.lbl_automix)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllowsseamless: String? =
      MyApp.getInstance().resources.getString(R.string.msg_allows_seamless)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCanvas: String? = MyApp.getInstance().resources.getString(R.string.lbl_canvas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDisplayshort: String? = MyApp.getInstance().resources.getString(R.string.msg_display_short)

)
