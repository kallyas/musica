package com.musica.app.modules.summaryone.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class SummaryOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewSummary: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_review_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.lbl_month)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListeningwith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_listening_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListeningwitho: String? =
      MyApp.getInstance().resources.getString(R.string.msg_listening_witho)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShuffleplay: String? = MyApp.getInstance().resources.getString(R.string.msg_shuffle_play)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAmount: String? = MyApp.getInstance().resources.getString(R.string.lbl_amount)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_9_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTax: String? = MyApp.getInstance().resources.getString(R.string.lbl_tax)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.msg2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChange: String? = MyApp.getInstance().resources.getString(R.string.lbl_change)

)
