package com.musica.app.modules.paymentmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPaymentMethodBinding
import com.musica.app.modules.paymentmethod.`data`.model.PaymentMethodRowModel
import com.musica.app.modules.paymentmethod.`data`.viewmodel.PaymentMethodVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PaymentMethodActivity :
    BaseActivity<ActivityPaymentMethodBinding>(R.layout.activity_payment_method) {
  private val viewModel: PaymentMethodVM by viewModels<PaymentMethodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val paymentMethodAdapter =
    PaymentMethodAdapter(viewModel.paymentMethodList.value?:mutableListOf())
    binding.recyclerPaymentMethod.adapter = paymentMethodAdapter
    paymentMethodAdapter.setOnItemClickListener(
    object : PaymentMethodAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PaymentMethodRowModel) {
        onClickRecyclerPaymentMethod(view, position, item)
      }
    }
    )
    viewModel.paymentMethodList.observe(this) {
      paymentMethodAdapter.updateData(it)
    }
    binding.paymentMethodVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerPaymentMethod(
    view: View,
    position: Int,
    item: PaymentMethodRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_METHOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PaymentMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
