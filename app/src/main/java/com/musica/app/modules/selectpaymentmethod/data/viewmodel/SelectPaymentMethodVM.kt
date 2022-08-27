package com.musica.app.modules.selectpaymentmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.selectpaymentmethod.`data`.model.ListgroupOneRowModel
import com.musica.app.modules.selectpaymentmethod.`data`.model.SelectPaymentMethodModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SelectPaymentMethodVM : ViewModel(), KoinComponent {
  val selectPaymentMethodModel: MutableLiveData<SelectPaymentMethodModel> =
      MutableLiveData(SelectPaymentMethodModel())

  var navArguments: Bundle? = null

  val listgroupOneList: MutableLiveData<MutableList<ListgroupOneRowModel>> =
      MutableLiveData(mutableListOf())
}
