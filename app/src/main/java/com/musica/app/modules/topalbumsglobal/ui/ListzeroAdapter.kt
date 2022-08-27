package com.musica.app.modules.topalbumsglobal.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListzeroBinding
import com.musica.app.modules.topalbumsglobal.`data`.model.ListzeroRowModel
import kotlin.Int
import kotlin.collections.List

class ListzeroAdapter(
  var list: List<ListzeroRowModel>
) : RecyclerView.Adapter<ListzeroAdapter.RowListzeroVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListzeroVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listzero,parent,false)
    return RowListzeroVH(view)
  }

  override fun onBindViewHolder(holder: RowListzeroVH, position: Int) {
    val listzeroRowModel = ListzeroRowModel()
    // TODO uncomment following line after integration with data source
    // val listzeroRowModel = list[position]
    holder.binding.listzeroRowModel = listzeroRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListzeroRowModel>) {
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
      item: ListzeroRowModel
    ) {
    }
  }

  inner class RowListzeroVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListzeroBinding = RowListzeroBinding.bind(itemView)
  }
}
