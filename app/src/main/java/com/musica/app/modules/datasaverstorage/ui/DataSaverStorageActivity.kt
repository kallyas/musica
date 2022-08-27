package com.musica.app.modules.datasaverstorage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityDataSaverStorageBinding
import com.musica.app.modules.datasaverstorage.`data`.viewmodel.DataSaverStorageVM
import kotlin.String
import kotlin.Unit

class DataSaverStorageActivity :
    BaseActivity<ActivityDataSaverStorageBinding>(R.layout.activity_data_saver_storage) {
  private val viewModel: DataSaverStorageVM by viewModels<DataSaverStorageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dataSaverStorageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DATA_SAVER_STORAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DataSaverStorageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
