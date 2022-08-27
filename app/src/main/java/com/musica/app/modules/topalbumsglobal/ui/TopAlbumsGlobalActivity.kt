package com.musica.app.modules.topalbumsglobal.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityTopAlbumsGlobalBinding
import com.musica.app.modules.topalbumsglobal.`data`.model.ListzeroRowModel
import com.musica.app.modules.topalbumsglobal.`data`.viewmodel.TopAlbumsGlobalVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TopAlbumsGlobalActivity :
    BaseActivity<ActivityTopAlbumsGlobalBinding>(R.layout.activity_top_albums_global) {
  private val viewModel: TopAlbumsGlobalVM by viewModels<TopAlbumsGlobalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listzeroAdapter = ListzeroAdapter(viewModel.listzeroList.value?:mutableListOf())
    binding.recyclerListzero.adapter = listzeroAdapter
    listzeroAdapter.setOnItemClickListener(
    object : ListzeroAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListzeroRowModel) {
        onClickRecyclerListzero(view, position, item)
      }
    }
    )
    viewModel.listzeroList.observe(this) {
      listzeroAdapter.updateData(it)
    }
    binding.topAlbumsGlobalVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListzero(
    view: View,
    position: Int,
    item: ListzeroRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TOP_ALBUMS_GLOBAL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TopAlbumsGlobalActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
