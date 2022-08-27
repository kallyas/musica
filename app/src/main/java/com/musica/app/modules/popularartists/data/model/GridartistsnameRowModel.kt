package com.musica.app.modules.popularartists.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class GridartistsnameRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArtistsName: String? = MyApp.getInstance().resources.getString(R.string.lbl_ariana_grande)

)
