package com.musica.app.modules.paymentmethod.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowPaymentMethodBinding
import com.musica.app.modules.paymentmethod.`data`.model.PaymentMethodRowModel
import kotlin.Int
import kotlin.collections.List

class PaymentMethodAdapter(
  var list: List<PaymentMethodRowModel>
) : RecyclerView.Adapter<PaymentMethodAdapter.RowPaymentMethodVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPaymentMethodVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_payment_method,parent,false)
    return RowPaymentMethodVH(view)
  }

  override fun onBindViewHolder(holder: RowPaymentMethodVH, position: Int) {
    val paymentMethodRowModel = PaymentMethodRowModel()
    // TODO uncomment following line after integration with data source
    // val paymentMethodRowModel = list[position]
    holder.binding.paymentMethodRowModel = paymentMethodRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PaymentMethodRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: PaymentMethodRowModel
    ) {
    }
  }

  inner class RowPaymentMethodVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPaymentMethodBinding = RowPaymentMethodBinding.bind(itemView)
  }
}
