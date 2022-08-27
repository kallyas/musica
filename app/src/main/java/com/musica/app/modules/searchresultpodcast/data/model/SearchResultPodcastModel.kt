package com.musica.app.modules.searchresultpodcast.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultPodcastModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcastsShow: String? = MyApp.getInstance().resources.getString(R.string.msg_podcasts_show)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_the_jordan_harb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppleTalk: String? = MyApp.getInstance().resources.getString(R.string.lbl_apple_talk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrDeath: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_death)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEpisodes: String? = MyApp.getInstance().resources.getString(R.string.lbl_episodes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
