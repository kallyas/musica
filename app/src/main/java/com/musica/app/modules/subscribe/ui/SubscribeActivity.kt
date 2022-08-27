package com.musica.app.modules.subscribe.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySubscribeBinding
import com.musica.app.modules.subscribe.`data`.model.SubscribeRowModel
import com.musica.app.modules.subscribe.`data`.viewmodel.SubscribeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SubscribeActivity : BaseActivity<ActivitySubscribeBinding>(R.layout.activity_subscribe) {
  private val viewModel: SubscribeVM by viewModels<SubscribeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val subscribeAdapter = SubscribeAdapter(viewModel.subscribeList.value?:mutableListOf())
    binding.recyclerSubscribe.adapter = subscribeAdapter
    subscribeAdapter.setOnItemClickListener(
    object : SubscribeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SubscribeRowModel) {
        onClickRecyclerSubscribe(view, position, item)
      }
    }
    )
    viewModel.subscribeList.observe(this) {
      subscribeAdapter.updateData(it)
    }
    binding.subscribeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSubscribe(
    view: View,
    position: Int,
    item: SubscribeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SUBSCRIBE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SubscribeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
