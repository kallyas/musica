package com.musica.app.modules.forgotpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.forgotpassword.`data`.model.ForgotPasswordModel
import com.musica.app.modules.forgotpassword.`data`.model.ListmusicRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ForgotPasswordVM : ViewModel(), KoinComponent {
  val forgotPasswordModel: MutableLiveData<ForgotPasswordModel> =
      MutableLiveData(ForgotPasswordModel())

  var navArguments: Bundle? = null

  val listmusicList: MutableLiveData<MutableList<ListmusicRowModel>> =
      MutableLiveData(mutableListOf())
}
