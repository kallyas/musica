package com.musica.app.modules.followersdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.followersdetails.`data`.model.FollowersDetailsModel
import com.musica.app.modules.followersdetails.`data`.model.Listprofilename1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FollowersDetailsVM : ViewModel(), KoinComponent {
  val followersDetailsModel: MutableLiveData<FollowersDetailsModel> =
      MutableLiveData(FollowersDetailsModel())

  var navArguments: Bundle? = null

  val listprofilenameList: MutableLiveData<MutableList<Listprofilename1RowModel>> =
      MutableLiveData(mutableListOf())
}
