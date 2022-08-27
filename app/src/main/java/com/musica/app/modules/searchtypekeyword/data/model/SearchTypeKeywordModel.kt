package com.musica.app.modules.searchtypekeyword.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SearchTypeKeywordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentSearches: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recent_searches)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArianaGrande: String? = MyApp.getInstance().resources.getString(R.string.lbl_ariana_grande)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMorganWallen: String? = MyApp.getInstance().resources.getString(R.string.lbl_morgan_wallen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJustinBieber: String? = MyApp.getInstance().resources.getString(R.string.lbl_justin_bieber)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrake: String? = MyApp.getInstance().resources.getString(R.string.lbl_drake)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOliviaRodrigo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_olivia_rodrigo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheWeeknd: String? = MyApp.getInstance().resources.getString(R.string.lbl_the_weeknd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaylorSwift: String? = MyApp.getInstance().resources.getString(R.string.lbl_taylor_swift)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJuiceWrld: String? = MyApp.getInstance().resources.getString(R.string.lbl_juice_wrld)

)
