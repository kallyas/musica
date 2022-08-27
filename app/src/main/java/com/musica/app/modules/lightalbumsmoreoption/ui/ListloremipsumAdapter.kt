package com.musica.app.modules.lightalbumsmoreoption.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListloremipsumBinding
import com.musica.app.modules.lightalbumsmoreoption.`data`.model.ListloremipsumRowModel
import kotlin.Int
import kotlin.collections.List

class ListloremipsumAdapter(
  var list: List<ListloremipsumRowModel>
) : RecyclerView.Adapter<ListloremipsumAdapter.RowListloremipsumVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListloremipsumVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listloremipsum,parent,false)
    return RowListloremipsumVH(view)
  }

  override fun onBindViewHolder(holder: RowListloremipsumVH, position: Int) {
    val listloremipsumRowModel = ListloremipsumRowModel()
    // TODO uncomment following line after integration with data source
    // val listloremipsumRowModel = list[position]
    holder.binding.listloremipsumRowModel = listloremipsumRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListloremipsumRowModel>) {
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
      item: ListloremipsumRowModel
    ) {
    }
  }

  inner class RowListloremipsumVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListloremipsumBinding = RowListloremipsumBinding.bind(itemView)
  }
}
