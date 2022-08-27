package com.musica.app.modules.newreleases.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class NewReleases1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPain: String? = MyApp.getInstance().resources.getString(R.string.lbl_pain)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRyanJones: String? = MyApp.getInstance().resources.getString(R.string.lbl_ryan_jones)

)
