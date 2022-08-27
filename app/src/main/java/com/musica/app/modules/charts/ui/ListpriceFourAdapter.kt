package com.musica.app.modules.charts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListpriceFourBinding
import com.musica.app.modules.charts.`data`.model.ListpriceFourRowModel
import kotlin.Int
import kotlin.collections.List

class ListpriceFourAdapter(
  var list: List<ListpriceFourRowModel>
) : RecyclerView.Adapter<ListpriceFourAdapter.RowListpriceFourVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpriceFourVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprice_four,parent,false)
    return RowListpriceFourVH(view)
  }

  override fun onBindViewHolder(holder: RowListpriceFourVH, position: Int) {
    val listpriceFourRowModel = ListpriceFourRowModel()
    // TODO uncomment following line after integration with data source
    // val listpriceFourRowModel = list[position]
    holder.binding.listpriceFourRowModel = listpriceFourRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListpriceFourRowModel>) {
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
      item: ListpriceFourRowModel
    ) {
    }
  }

  inner class RowListpriceFourVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpriceFourBinding = RowListpriceFourBinding.bind(itemView)
  }
}
