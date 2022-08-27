package com.musica.app.modules.profiledetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityProfileDetailsBinding
import com.musica.app.modules.profiledetails.`data`.viewmodel.ProfileDetailsVM
import kotlin.String
import kotlin.Unit

class ProfileDetailsActivity :
    BaseActivity<ActivityProfileDetailsBinding>(R.layout.activity_profile_details) {
  private val viewModel: ProfileDetailsVM by viewModels<ProfileDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
