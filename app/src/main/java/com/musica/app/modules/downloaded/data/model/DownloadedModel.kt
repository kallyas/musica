package com.musica.app.modules.downloaded.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class DownloadedModel(
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
  var txtYourLikes: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_likes)
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
