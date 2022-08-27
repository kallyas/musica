package com.musica.app.modules.paymentmethod.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentMethodRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPayPal: String? = MyApp.getInstance().resources.getString(R.string.lbl_paypal)

)
