package com.musica.app.modules.mylibrary.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityMyLibraryBinding
import com.musica.app.modules.mylibrary.`data`.viewmodel.MyLibraryVM
import kotlin.String
import kotlin.Unit

class MyLibraryActivity : BaseActivity<ActivityMyLibraryBinding>(R.layout.activity_my_library) {
  private val viewModel: MyLibraryVM by viewModels<MyLibraryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myLibraryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MY_LIBRARY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyLibraryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
