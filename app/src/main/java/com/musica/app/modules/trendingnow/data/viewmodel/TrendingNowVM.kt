package com.musica.app.modules.trendingnow.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.trendingnow.`data`.model.TrendingNowModel
import com.musica.app.modules.trendingnow.`data`.model.TrendingNowRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TrendingNowVM : ViewModel(), KoinComponent {
  val trendingNowModel: MutableLiveData<TrendingNowModel> = MutableLiveData(TrendingNowModel())

  var navArguments: Bundle? = null

  val trendingNowList: MutableLiveData<MutableList<TrendingNowRowModel>> =
      MutableLiveData(mutableListOf())
}
