package com.musica.app.modules.setfingerprint.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySetFingerprintBinding
import com.musica.app.modules.setfingerprint.`data`.viewmodel.SetFingerprintVM
import kotlin.String
import kotlin.Unit

class SetFingerprintActivity :
    BaseActivity<ActivitySetFingerprintBinding>(R.layout.activity_set_fingerprint) {
  private val viewModel: SetFingerprintVM by viewModels<SetFingerprintVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.setFingerprintVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SET_FINGERPRINT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SetFingerprintActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
