package com.musica.app.modules.lighthome.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class LightHomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodMorning: String? = MyApp.getInstance().resources.getString(R.string.lbl_good_morning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndrewAinsley: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_andrew_ainsley)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_trending_now)
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
      MyApp.getInstance().resources.getString(R.string.msg_shades_of_love)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDolOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_without_you_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremIpsumDolTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_save_your_tears)
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
  var txtArtistsName: String? = MyApp.getInstance().resources.getString(R.string.lbl_ariana_grande)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtistsNameOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_the_weeknd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtistsNameTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_acidrap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopCharts: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_charts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_hits)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.msg_top_hits_indo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLibrary: String? = MyApp.getInstance().resources.getString(R.string.lbl_library)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
