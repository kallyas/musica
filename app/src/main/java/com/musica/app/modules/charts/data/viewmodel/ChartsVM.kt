package com.musica.app.modules.charts.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.charts.`data`.model.ChartsModel
import com.musica.app.modules.charts.`data`.model.Listprice1RowModel
import com.musica.app.modules.charts.`data`.model.ListpriceFourRowModel
import com.musica.app.modules.charts.`data`.model.ListpriceTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChartsVM : ViewModel(), KoinComponent {
  val chartsModel: MutableLiveData<ChartsModel> = MutableLiveData(ChartsModel())

  var navArguments: Bundle? = null

  val listpriceList: MutableLiveData<MutableList<Listprice1RowModel>> =
      MutableLiveData(mutableListOf())

  val listpriceTwoList: MutableLiveData<MutableList<ListpriceTwoRowModel>> =
      MutableLiveData(mutableListOf())

  val listpriceFourList: MutableLiveData<MutableList<ListpriceFourRowModel>> =
      MutableLiveData(mutableListOf())
}
