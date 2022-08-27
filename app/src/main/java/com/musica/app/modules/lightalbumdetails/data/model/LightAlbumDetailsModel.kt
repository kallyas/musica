package com.musica.app.modules.lightalbumdetails.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class LightAlbumDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSweetener: String? = MyApp.getInstance().resources.getString(R.string.lbl_sweetener)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArianaGrande: String? = MyApp.getInstance().resources.getString(R.string.lbl_ariana_grande)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbum: String? = MyApp.getInstance().resources.getString(R.string.lbl_album)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2018)
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

)
