package com.musica.app.modules.yourlikes.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class YourLikesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcasts: String? = MyApp.getInstance().resources.getString(R.string.lbl_podcasts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQueue: String? = MyApp.getInstance().resources.getString(R.string.lbl_queue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloaded: String? = MyApp.getInstance().resources.getString(R.string.lbl_downloaded)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHorizontalTab: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_likes)
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

)
