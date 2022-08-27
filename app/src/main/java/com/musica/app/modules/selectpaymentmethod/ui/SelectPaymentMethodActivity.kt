package com.musica.app.modules.selectpaymentmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySelectPaymentMethodBinding
import com.musica.app.modules.selectpaymentmethod.`data`.model.ListgroupOneRowModel
import com.musica.app.modules.selectpaymentmethod.`data`.viewmodel.SelectPaymentMethodVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SelectPaymentMethodActivity :
    BaseActivity<ActivitySelectPaymentMethodBinding>(R.layout.activity_select_payment_method) {
  private val viewModel: SelectPaymentMethodVM by viewModels<SelectPaymentMethodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroupOneAdapter =
    ListgroupOneAdapter(viewModel.listgroupOneList.value?:mutableListOf())
    binding.recyclerListgroupOne.adapter = listgroupOneAdapter
    listgroupOneAdapter.setOnItemClickListener(
    object : ListgroupOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgroupOneRowModel) {
        onClickRecyclerListgroupOne(view, position, item)
      }
    }
    )
    viewModel.listgroupOneList.observe(this) {
      listgroupOneAdapter.updateData(it)
    }
    binding.selectPaymentMethodVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListgroupOne(
    view: View,
    position: Int,
    item: ListgroupOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SELECT_PAYMENT_METHOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SelectPaymentMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
