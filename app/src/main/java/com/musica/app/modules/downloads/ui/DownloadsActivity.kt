package com.musica.app.modules.downloads.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityDownloadsBinding
import com.musica.app.modules.downloads.`data`.model.DownloadsRowModel
import com.musica.app.modules.downloads.`data`.viewmodel.DownloadsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DownloadsActivity : BaseActivity<ActivityDownloadsBinding>(R.layout.activity_downloads) {
  private val viewModel: DownloadsVM by viewModels<DownloadsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val downloadsAdapter = DownloadsAdapter(viewModel.downloadsList.value?:mutableListOf())
    binding.recyclerDownloads.adapter = downloadsAdapter
    downloadsAdapter.setOnItemClickListener(
    object : DownloadsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DownloadsRowModel) {
        onClickRecyclerDownloads(view, position, item)
      }
    }
    )
    viewModel.downloadsList.observe(this) {
      downloadsAdapter.updateData(it)
    }
    binding.downloadsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerDownloads(
    view: View,
    position: Int,
    item: DownloadsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DOWNLOADS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DownloadsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
