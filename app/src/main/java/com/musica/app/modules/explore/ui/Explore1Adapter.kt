package com.musica.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowExplore1Binding
import com.musica.app.modules.explore.`data`.model.Explore1RowModel
import kotlin.Int
import kotlin.collections.List

class Explore1Adapter(
  var list: List<Explore1RowModel>
) : RecyclerView.Adapter<Explore1Adapter.RowExplore1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowExplore1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_explore1,parent,false)
    return RowExplore1VH(view)
  }

  override fun onBindViewHolder(holder: RowExplore1VH, position: Int) {
    val explore1RowModel = Explore1RowModel()
    // TODO uncomment following line after integration with data source
    // val explore1RowModel = list[position]
    holder.binding.explore1RowModel = explore1RowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Explore1RowModel>) {
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
      item: Explore1RowModel
    ) {
    }
  }

  inner class RowExplore1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowExplore1Binding = RowExplore1Binding.bind(itemView)
  }
}
