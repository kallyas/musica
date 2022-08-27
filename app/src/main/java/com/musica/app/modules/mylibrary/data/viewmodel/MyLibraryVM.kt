package com.musica.app.modules.mylibrary.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musica.app.modules.mylibrary.`data`.model.MyLibraryModel
import org.koin.core.KoinComponent

class MyLibraryVM : ViewModel(), KoinComponent {
  val myLibraryModel: MutableLiveData<MyLibraryModel> = MutableLiveData(MyLibraryModel())

  var navArguments: Bundle? = null
}
