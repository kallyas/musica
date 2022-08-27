package com.musica.app.modules.searchnotfound.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SearchNotFoundModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTy: String? = MyApp.getInstance().resources.getString(R.string.lbl_top)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_profiles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotFound: String? = MyApp.getInstance().resources.getString(R.string.lbl_not_found)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSorrythekeyw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sorry_the_keyw)

)
