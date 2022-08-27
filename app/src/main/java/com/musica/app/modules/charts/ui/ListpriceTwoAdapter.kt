package com.musica.app.modules.charts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListpriceTwoBinding
import com.musica.app.modules.charts.`data`.model.ListpriceTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListpriceTwoAdapter(
  var list: List<ListpriceTwoRowModel>
) : RecyclerView.Adapter<ListpriceTwoAdapter.RowListpriceTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpriceTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprice_two,parent,false)
    return RowListpriceTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListpriceTwoVH, position: Int) {
    val listpriceTwoRowModel = ListpriceTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listpriceTwoRowModel = list[position]
    holder.binding.listpriceTwoRowModel = listpriceTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListpriceTwoRowModel>) {
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
      item: ListpriceTwoRowModel
    ) {
    }
  }

  inner class RowListpriceTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpriceTwoBinding = RowListpriceTwoBinding.bind(itemView)
  }
}
