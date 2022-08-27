package com.musica.app.modules.profiledetailsone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityProfileDetailsOneBinding
import com.musica.app.modules.profiledetailsone.`data`.viewmodel.ProfileDetailsOneVM
import kotlin.String
import kotlin.Unit

class ProfileDetailsOneActivity :
    BaseActivity<ActivityProfileDetailsOneBinding>(R.layout.activity_profile_details_one) {
  private val viewModel: ProfileDetailsOneVM by viewModels<ProfileDetailsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileDetailsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_DETAILS_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileDetailsOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
