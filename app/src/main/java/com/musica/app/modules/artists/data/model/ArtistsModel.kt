package com.musica.app.modules.artists.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ArtistsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArtists: String? = MyApp.getInstance().resources.getString(R.string.lbl_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSingers: String? = MyApp.getInstance().resources.getString(R.string.lbl_singers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcasters: String? = MyApp.getInstance().resources.getString(R.string.lbl_podcasters)
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

)
