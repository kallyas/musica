package com.musica.app.modules.newreleases.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class NewReleasesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewReleases: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_releases)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheBestNewRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_best_new_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewAlbumsSi: String? = MyApp.getInstance().resources.getString(R.string.msg_new_albums_si)

)
