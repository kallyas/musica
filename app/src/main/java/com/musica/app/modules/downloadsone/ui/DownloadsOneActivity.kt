package com.musica.app.modules.downloadsone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityDownloadsOneBinding
import com.musica.app.modules.downloadsone.`data`.model.DownloadsOneRowModel
import com.musica.app.modules.downloadsone.`data`.viewmodel.DownloadsOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DownloadsOneActivity :
    BaseActivity<ActivityDownloadsOneBinding>(R.layout.activity_downloads_one) {
  private val viewModel: DownloadsOneVM by viewModels<DownloadsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val downloadsOneAdapter =
    DownloadsOneAdapter(viewModel.downloadsOneList.value?:mutableListOf())
    binding.recyclerDownloadsOne.adapter = downloadsOneAdapter
    downloadsOneAdapter.setOnItemClickListener(
    object : DownloadsOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DownloadsOneRowModel) {
        onClickRecyclerDownloadsOne(view, position, item)
      }
    }
    )
    viewModel.downloadsOneList.observe(this) {
      downloadsOneAdapter.updateData(it)
    }
    binding.downloadsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerDownloadsOne(
    view: View,
    position: Int,
    item: DownloadsOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DOWNLOADS_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DownloadsOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
