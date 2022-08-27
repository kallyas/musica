package com.musica.app.modules.songs.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SongsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSongs: String? = MyApp.getInstance().resources.getString(R.string.lbl_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSortby: String? = MyApp.getInstance().resources.getString(R.string.lbl_sort_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlyDownlo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recently_downlo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_shuffle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_play)

)
