package com.musica.app.modules.summaryone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySummaryOneBinding
import com.musica.app.modules.summaryone.`data`.viewmodel.SummaryOneVM
import kotlin.String
import kotlin.Unit

class SummaryOneActivity : BaseActivity<ActivitySummaryOneBinding>(R.layout.activity_summary_one) {
  private val viewModel: SummaryOneVM by viewModels<SummaryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.summaryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUMMARY_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SummaryOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
