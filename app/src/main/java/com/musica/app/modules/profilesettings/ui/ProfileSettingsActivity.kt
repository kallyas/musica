package com.musica.app.modules.profilesettings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityProfileSettingsBinding
import com.musica.app.modules.profilesettings.`data`.viewmodel.ProfileSettingsVM
import kotlin.String
import kotlin.Unit

class ProfileSettingsActivity :
    BaseActivity<ActivityProfileSettingsBinding>(R.layout.activity_profile_settings) {
  private val viewModel: ProfileSettingsVM by viewModels<ProfileSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_SETTINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileSettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
