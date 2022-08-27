package com.musica.app.modules.lightwalkthrough.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityLightWalkthroughBinding
import com.musica.app.modules.lightwalkthrough.`data`.viewmodel.LightWalkthroughVM
import kotlin.String
import kotlin.Unit

class LightWalkthroughActivity :
    BaseActivity<ActivityLightWalkthroughBinding>(R.layout.activity_light_walkthrough) {
  private val viewModel: LightWalkthroughVM by viewModels<LightWalkthroughVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.lightWalkthroughVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LIGHT_WALKTHROUGH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LightWalkthroughActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
