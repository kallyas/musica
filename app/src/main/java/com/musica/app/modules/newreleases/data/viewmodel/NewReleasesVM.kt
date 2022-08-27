package com.musica.app.modules.newreleases.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.newreleases.`data`.model.NewReleases1RowModel
import com.musica.app.modules.newreleases.`data`.model.NewReleasesModel
import com.musica.app.modules.newreleases.`data`.model.NewReleasesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NewReleasesVM : ViewModel(), KoinComponent {
  val newReleasesModel: MutableLiveData<NewReleasesModel> = MutableLiveData(NewReleasesModel())

  var navArguments: Bundle? = null

  val newReleasesList: MutableLiveData<MutableList<NewReleasesRowModel>> =
      MutableLiveData(mutableListOf())

  val newReleases1List: MutableLiveData<MutableList<NewReleases1RowModel>> =
      MutableLiveData(mutableListOf())
}
