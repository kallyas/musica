package com.musica.app.modules.language.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityLanguageBinding
import com.musica.app.modules.language.`data`.viewmodel.LanguageVM
import kotlin.String
import kotlin.Unit

class LanguageActivity : BaseActivity<ActivityLanguageBinding>(R.layout.activity_language) {
  private val viewModel: LanguageVM by viewModels<LanguageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.languageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "LANGUAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LanguageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
