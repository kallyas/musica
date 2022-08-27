package com.musica.app.modules.lightalbumsmoreoption.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class LightAlbumsMoreOptionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleSection: String? = MyApp.getInstance().resources.getString(R.string.lbl_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSortby: String? = MyApp.getInstance().resources.getString(R.string.lbl_sort_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlyAdded: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recently_added)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdown: String? = MyApp.getInstance().resources.getString(R.string.lbl_shuffle_play)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdownOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_to_playlist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdownTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdownThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_remove_from_lib)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdownFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_artist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdownFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_share)

)
