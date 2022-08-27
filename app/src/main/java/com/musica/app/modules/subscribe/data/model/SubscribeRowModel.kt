package com.musica.app.modules.subscribe.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SubscribeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.lbl_month)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListeningwith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_listening_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListeningwitho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_listening_witho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShuffleplay: String? = MyApp.getInstance().resources.getString(R.string.msg_shuffle_play)

)
