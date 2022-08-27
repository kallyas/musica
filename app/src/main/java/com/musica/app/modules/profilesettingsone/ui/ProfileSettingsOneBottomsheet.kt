package com.musica.app.modules.profilesettingsone.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.musica.app.databinding.BottomsheetProfileSettingsOneBinding
import com.musica.app.modules.profilesettingsone.`data`.viewmodel.ProfileSettingsOneVM
import kotlin.String
import kotlin.Unit

class ProfileSettingsOneBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetProfileSettingsOneBinding>(R.layout.bottomsheet_profile_settings_one)
    {
  private val viewModel: ProfileSettingsOneVM by viewModels<ProfileSettingsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileSettingsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCancel.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_SETTINGS_ONE_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): ProfileSettingsOneBottomsheet {
      val fragment = ProfileSettingsOneBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
