package com.musica.app.modules.addnewcard.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class AddNewCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddNewCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_new_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMocard: String? = MyApp.getInstance().resources.getString(R.string.lbl_mocard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEight: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardHoldernam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_card_holder_nam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNine: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpirydate: String? = MyApp.getInstance().resources.getString(R.string.lbl_expiry_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardName: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpiryDateOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_expiry_date2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_07_26)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCVV: String? = MyApp.getInstance().resources.getString(R.string.lbl_cvv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTyTwoValue: String? = null
)
