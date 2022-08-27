package com.musica.app.modules.charts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListprice1Binding
import com.musica.app.modules.charts.`data`.model.Listprice1RowModel
import kotlin.Int
import kotlin.collections.List

class ListpriceAdapter(
  var list: List<Listprice1RowModel>
) : RecyclerView.Adapter<ListpriceAdapter.RowListprice1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprice1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprice1,parent,false)
    return RowListprice1VH(view)
  }

  override fun onBindViewHolder(holder: RowListprice1VH, position: Int) {
    val listprice1RowModel = Listprice1RowModel()
    // TODO uncomment following line after integration with data source
    // val listprice1RowModel = list[position]
    holder.binding.listprice1RowModel = listprice1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprice1RowModel>) {
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
      item: Listprice1RowModel
    ) {
    }
  }

  inner class RowListprice1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprice1Binding = RowListprice1Binding.bind(itemView)
  }
}
