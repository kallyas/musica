package com.musica.app.modules.subscribe.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SubscribeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSubscribetoPr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_subscribe_to_pr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnjoylistening: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_listening2)

)
