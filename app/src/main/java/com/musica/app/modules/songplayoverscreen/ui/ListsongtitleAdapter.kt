package com.musica.app.modules.songplayoverscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListsongtitle4Binding
import com.musica.app.modules.songplayoverscreen.`data`.model.Listsongtitle4RowModel
import kotlin.Int
import kotlin.collections.List

class ListsongtitleAdapter(
  var list: List<Listsongtitle4RowModel>
) : RecyclerView.Adapter<ListsongtitleAdapter.RowListsongtitle4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsongtitle4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsongtitle4,parent,false)
    return RowListsongtitle4VH(view)
  }

  override fun onBindViewHolder(holder: RowListsongtitle4VH, position: Int) {
    val listsongtitle4RowModel = Listsongtitle4RowModel()
    // TODO uncomment following line after integration with data source
    // val listsongtitle4RowModel = list[position]
    holder.binding.listsongtitle4RowModel = listsongtitle4RowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsongtitle4RowModel>) {
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
      item: Listsongtitle4RowModel
    ) {
    }
  }

  inner class RowListsongtitle4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsongtitle4Binding = RowListsongtitle4Binding.bind(itemView)
  }
}
