package com.musica.app.modules.createnewpin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityCreateNewPinBinding
import com.musica.app.modules.createnewpin.`data`.viewmodel.CreateNewPinVM
import kotlin.String
import kotlin.Unit

class CreateNewPinActivity :
    BaseActivity<ActivityCreateNewPinBinding>(R.layout.activity_create_new_pin) {
  private val viewModel: CreateNewPinVM by viewModels<CreateNewPinVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createNewPinVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CREATE_NEW_PIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreateNewPinActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
