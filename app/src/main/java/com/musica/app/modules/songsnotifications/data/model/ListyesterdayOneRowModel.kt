package com.musica.app.modules.songsnotifications.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ListyesterdayOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYesterdayOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_yesterday)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_04_36_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSharks: String? = MyApp.getInstance().resources.getString(R.string.lbl_sharks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeyonceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_beyonce)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbumOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_album)

)
