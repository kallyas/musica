package com.musica.app.modules.resetpaswordsuccessful.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseDialogFragment
import com.musica.app.databinding.DialogResetPaswordSuccessfulBinding
import com.musica.app.modules.resetpaswordsuccessful.`data`.viewmodel.ResetPaswordSuccessfulVM
import kotlin.String
import kotlin.Unit

class ResetPaswordSuccessfulDialog :
    BaseDialogFragment<DialogResetPaswordSuccessfulBinding>(R.layout.dialog_reset_pasword_successful)
    {
  private val viewModel: ResetPaswordSuccessfulVM by viewModels<ResetPaswordSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.resetPaswordSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RESET_PASWORD_SUCCESSFUL_DIALOG"


    fun getInstance(bundle: Bundle?): ResetPaswordSuccessfulDialog {
      val fragment = ResetPaswordSuccessfulDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
