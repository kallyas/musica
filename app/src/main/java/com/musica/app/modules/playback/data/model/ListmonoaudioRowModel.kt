package com.musica.app.modules.playback.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ListmonoaudioRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMonoAudio: String? = MyApp.getInstance().resources.getString(R.string.lbl_mono_audio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMakestkeleft: String? =
      MyApp.getInstance().resources.getString(R.string.msg_makes_tke_left)

)
