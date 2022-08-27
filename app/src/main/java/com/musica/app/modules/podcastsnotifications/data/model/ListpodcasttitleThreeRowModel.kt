package com.musica.app.modules.podcastsnotifications.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ListpodcasttitleThreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcastTitleThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_621_reid_hoffm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAuthorTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_invest_like_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeventySix: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_52_20_mins)

)
