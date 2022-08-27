package com.musica.app.modules.popularartists.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowGridartistsnameBinding
import com.musica.app.modules.popularartists.`data`.model.GridartistsnameRowModel
import kotlin.Int
import kotlin.collections.List

class GridartistsnameAdapter(
  var list: List<GridartistsnameRowModel>
) : RecyclerView.Adapter<GridartistsnameAdapter.RowGridartistsnameVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridartistsnameVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridartistsname,parent,false)
    return RowGridartistsnameVH(view)
  }

  override fun onBindViewHolder(holder: RowGridartistsnameVH, position: Int) {
    val gridartistsnameRowModel = GridartistsnameRowModel()
    // TODO uncomment following line after integration with data source
    // val gridartistsnameRowModel = list[position]
    holder.binding.gridartistsnameRowModel = gridartistsnameRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridartistsnameRowModel>) {
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
      item: GridartistsnameRowModel
    ) {
    }
  }

  inner class RowGridartistsnameVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridartistsnameBinding = RowGridartistsnameBinding.bind(itemView)
  }
}
