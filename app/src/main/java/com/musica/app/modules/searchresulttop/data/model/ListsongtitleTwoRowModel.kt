package com.musica.app.modules.searchresulttop.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ListsongtitleTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSongTitleTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_firework_cover)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailsSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_the_sappear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiftySix: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_song)

)
