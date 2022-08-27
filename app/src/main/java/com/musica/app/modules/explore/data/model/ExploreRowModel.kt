package com.musica.app.modules.explore.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ExploreRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_charts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcasts: String? = MyApp.getInstance().resources.getString(R.string.lbl_podcasts)

)
