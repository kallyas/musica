package com.musica.app.modules.paymentmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.paymentmethod.`data`.model.PaymentMethodModel
import com.musica.app.modules.paymentmethod.`data`.model.PaymentMethodRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PaymentMethodVM : ViewModel(), KoinComponent {
  val paymentMethodModel: MutableLiveData<PaymentMethodModel> =
      MutableLiveData(PaymentMethodModel())

  var navArguments: Bundle? = null

  val paymentMethodList: MutableLiveData<MutableList<PaymentMethodRowModel>> =
      MutableLiveData(mutableListOf())
}
