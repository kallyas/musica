package com.musica.app.modules.summary.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseDialogFragment
import com.musica.app.databinding.DialogSummaryBinding
import com.musica.app.modules.summary.`data`.viewmodel.SummaryVM
import kotlin.String
import kotlin.Unit

class SummaryDialog : BaseDialogFragment<DialogSummaryBinding>(R.layout.dialog_summary) {
  private val viewModel: SummaryVM by viewModels<SummaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.summaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUMMARY_DIALOG"


    fun getInstance(bundle: Bundle?): SummaryDialog {
      val fragment = SummaryDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}
