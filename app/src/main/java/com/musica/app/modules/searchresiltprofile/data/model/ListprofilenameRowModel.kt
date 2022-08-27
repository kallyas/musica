package com.musica.app.modules.searchresiltprofile.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ListprofilenameRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileName: String? = MyApp.getInstance().resources.getString(R.string.lbl_jenny_wilson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowersCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_9_489_followers)

)
