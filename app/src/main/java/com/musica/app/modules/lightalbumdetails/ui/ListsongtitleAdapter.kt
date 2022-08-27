package com.musica.app.modules.lightalbumdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListsongtitle1Binding
import com.musica.app.modules.lightalbumdetails.`data`.model.Listsongtitle1RowModel
import kotlin.Int
import kotlin.collections.List

class ListsongtitleAdapter(
  var list: List<Listsongtitle1RowModel>
) : RecyclerView.Adapter<ListsongtitleAdapter.RowListsongtitle1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsongtitle1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsongtitle1,parent,false)
    return RowListsongtitle1VH(view)
  }

  override fun onBindViewHolder(holder: RowListsongtitle1VH, position: Int) {
    val listsongtitle1RowModel = Listsongtitle1RowModel()
    // TODO uncomment following line after integration with data source
    // val listsongtitle1RowModel = list[position]
    holder.binding.listsongtitle1RowModel = listsongtitle1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsongtitle1RowModel>) {
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
      item: Listsongtitle1RowModel
    ) {
    }
  }

  inner class RowListsongtitle1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsongtitle1Binding = RowListsongtitle1Binding.bind(itemView)
  }
}
