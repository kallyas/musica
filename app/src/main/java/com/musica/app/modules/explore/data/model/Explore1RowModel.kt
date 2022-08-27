package com.musica.app.modules.explore.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class Explore1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPop: String? = MyApp.getInstance().resources.getString(R.string.lbl_pop)

)
