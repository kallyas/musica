package com.musica.app.modules.podcasts.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class PodcastsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcasts: String? = MyApp.getInstance().resources.getString(R.string.lbl_podcasts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularPodcast: String? =
      MyApp.getInstance().resources.getString(R.string.msg_popular_podcast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_610_bill_sulli)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDolOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_487_mike_rowe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDolTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_938_tom_wright)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularArtists: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrDeath: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_death)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppleTalk: String? = MyApp.getInstance().resources.getString(R.string.lbl_apple_talk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhataDay: String? = MyApp.getInstance().resources.getString(R.string.lbl_what_a_day)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
