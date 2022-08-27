package com.musica.app.modules.downloaded.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityDownloadedBinding
import com.musica.app.modules.downloaded.`data`.model.DownloadedRowModel
import com.musica.app.modules.downloaded.`data`.viewmodel.DownloadedVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DownloadedActivity : BaseActivity<ActivityDownloadedBinding>(R.layout.activity_downloaded) {
  private val viewModel: DownloadedVM by viewModels<DownloadedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val downloadedAdapter = DownloadedAdapter(viewModel.downloadedList.value?:mutableListOf())
    binding.recyclerDownloaded.adapter = downloadedAdapter
    downloadedAdapter.setOnItemClickListener(
    object : DownloadedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DownloadedRowModel) {
        onClickRecyclerDownloaded(view, position, item)
      }
    }
    )
    viewModel.downloadedList.observe(this) {
      downloadedAdapter.updateData(it)
    }
    binding.downloadedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerDownloaded(
    view: View,
    position: Int,
    item: DownloadedRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DOWNLOADED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DownloadedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
