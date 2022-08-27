package com.musica.app.modules.moreoptions.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class MoreOptionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtStarboy: String? = MyApp.getInstance().resources.getString(R.string.lbl_starboy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheWeekndDaf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_weeknd_daf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInfo: String? = MyApp.getInstance().resources.getString(R.string.lbl_song)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyNine: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_03_50_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChips: String? = MyApp.getInstance().resources.getString(R.string.lbl_play)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMoreLikeThis: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_more_like_this)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdown: String? = MyApp.getInstance().resources.getString(R.string.lbl_don_t_play_this)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdownOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_artist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdownTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_go_to_album)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdownThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_share)

)
