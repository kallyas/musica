package com.musica.app.modules.selectpaymentmethod.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListgroupOneBinding
import com.musica.app.modules.selectpaymentmethod.`data`.model.ListgroupOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupOneAdapter(
  var list: List<ListgroupOneRowModel>
) : RecyclerView.Adapter<ListgroupOneAdapter.RowListgroupOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroup_one,parent,false)
    return RowListgroupOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupOneVH, position: Int) {
    val listgroupOneRowModel = ListgroupOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupOneRowModel = list[position]
    holder.binding.listgroupOneRowModel = listgroupOneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListgroupOneRowModel>) {
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
      item: ListgroupOneRowModel
    ) {
    }
  }

  inner class RowListgroupOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupOneBinding = RowListgroupOneBinding.bind(itemView)
  }
}
