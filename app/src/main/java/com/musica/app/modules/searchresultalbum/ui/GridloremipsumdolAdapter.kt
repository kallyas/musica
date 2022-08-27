package com.musica.app.modules.searchresultalbum.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowGridloremipsumdolBinding
import com.musica.app.modules.searchresultalbum.`data`.model.GridloremipsumdolRowModel
import kotlin.Int
import kotlin.collections.List

class GridloremipsumdolAdapter(
  var list: List<GridloremipsumdolRowModel>
) : RecyclerView.Adapter<GridloremipsumdolAdapter.RowGridloremipsumdolVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridloremipsumdolVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridloremipsumdol,parent,false)
    return RowGridloremipsumdolVH(view)
  }

  override fun onBindViewHolder(holder: RowGridloremipsumdolVH, position: Int) {
    val gridloremipsumdolRowModel = GridloremipsumdolRowModel()
    // TODO uncomment following line after integration with data source
    // val gridloremipsumdolRowModel = list[position]
    holder.binding.gridloremipsumdolRowModel = gridloremipsumdolRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridloremipsumdolRowModel>) {
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
      item: GridloremipsumdolRowModel
    ) {
    }
  }

  inner class RowGridloremipsumdolVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridloremipsumdolBinding = RowGridloremipsumdolBinding.bind(itemView)
  }
}
