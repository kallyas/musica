package com.musica.app.modules.lighthome.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityLightHomeBinding
import com.musica.app.modules.lighthome.`data`.model.ListpriceRowModel
import com.musica.app.modules.lighthome.`data`.viewmodel.LightHomeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LightHomeActivity : BaseActivity<ActivityLightHomeBinding>(R.layout.activity_light_home) {
  private val viewModel: LightHomeVM by viewModels<LightHomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listpriceAdapter = ListpriceAdapter(viewModel.listpriceList.value?:mutableListOf())
    binding.recyclerListprice.adapter = listpriceAdapter
    listpriceAdapter.setOnItemClickListener(
    object : ListpriceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpriceRowModel) {
        onClickRecyclerListprice(view, position, item)
      }
    }
    )
    viewModel.listpriceList.observe(this) {
      listpriceAdapter.updateData(it)
    }
    binding.lightHomeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListprice(
    view: View,
    position: Int,
    item: ListpriceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIGHT_HOME_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LightHomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
