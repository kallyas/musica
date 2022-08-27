package com.musica.app.modules.searchresultplaylist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowGridloremipsumdolOneBinding
import com.musica.app.modules.searchresultplaylist.`data`.model.GridloremipsumdolOneRowModel
import kotlin.Int
import kotlin.collections.List

class GridloremipsumdolOneAdapter(
  var list: List<GridloremipsumdolOneRowModel>
) : RecyclerView.Adapter<GridloremipsumdolOneAdapter.RowGridloremipsumdolOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridloremipsumdolOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridloremipsumdol_one,parent,false)
    return RowGridloremipsumdolOneVH(view)
  }

  override fun onBindViewHolder(holder: RowGridloremipsumdolOneVH, position: Int) {
    val gridloremipsumdolOneRowModel = GridloremipsumdolOneRowModel()
    // TODO uncomment following line after integration with data source
    // val gridloremipsumdolOneRowModel = list[position]
    holder.binding.gridloremipsumdolOneRowModel = gridloremipsumdolOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridloremipsumdolOneRowModel>) {
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
      item: GridloremipsumdolOneRowModel
    ) {
    }
  }

  inner class RowGridloremipsumdolOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridloremipsumdolOneBinding = RowGridloremipsumdolOneBinding.bind(itemView)
  }
}
