package com.musica.app.modules.podcasts.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class PodcastsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPolitics: String? = MyApp.getInstance().resources.getString(R.string.lbl_politics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBusiness: String? = MyApp.getInstance().resources.getString(R.string.lbl_business)

)
