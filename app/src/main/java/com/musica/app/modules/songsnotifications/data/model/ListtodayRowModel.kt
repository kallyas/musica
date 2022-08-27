package com.musica.app.modules.songsnotifications.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ListtodayRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_04_36_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBREAKMYSOUL: String? = MyApp.getInstance().resources.getString(R.string.lbl_break_my_soul)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeyonce: String? = MyApp.getInstance().resources.getString(R.string.lbl_beyonce)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbum: String? = MyApp.getInstance().resources.getString(R.string.lbl_album)

)
