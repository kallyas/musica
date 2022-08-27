package com.musica.app.modules.moreoptions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityMoreOptionsBinding
import com.musica.app.modules.moreoptions.`data`.model.MoreOptionsRowModel
import com.musica.app.modules.moreoptions.`data`.viewmodel.MoreOptionsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MoreOptionsActivity : BaseActivity<ActivityMoreOptionsBinding>(R.layout.activity_more_options)
    {
  private val viewModel: MoreOptionsVM by viewModels<MoreOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val moreOptionsAdapter =
    MoreOptionsAdapter(viewModel.moreOptionsList.value?:mutableListOf())
    binding.recyclerMoreOptions.adapter = moreOptionsAdapter
    moreOptionsAdapter.setOnItemClickListener(
    object : MoreOptionsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MoreOptionsRowModel) {
        onClickRecyclerMoreOptions(view, position, item)
      }
    }
    )
    viewModel.moreOptionsList.observe(this) {
      moreOptionsAdapter.updateData(it)
    }
    binding.moreOptionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerMoreOptions(
    view: View,
    position: Int,
    item: MoreOptionsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MORE_OPTIONS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MoreOptionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
