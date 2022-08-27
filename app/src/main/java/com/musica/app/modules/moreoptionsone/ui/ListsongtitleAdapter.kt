package com.musica.app.modules.moreoptionsone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListsongtitle5Binding
import com.musica.app.modules.moreoptionsone.`data`.model.Listsongtitle5RowModel
import kotlin.Int
import kotlin.collections.List

class ListsongtitleAdapter(
  var list: List<Listsongtitle5RowModel>
) : RecyclerView.Adapter<ListsongtitleAdapter.RowListsongtitle5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsongtitle5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsongtitle5,parent,false)
    return RowListsongtitle5VH(view)
  }

  override fun onBindViewHolder(holder: RowListsongtitle5VH, position: Int) {
    val listsongtitle5RowModel = Listsongtitle5RowModel()
    // TODO uncomment following line after integration with data source
    // val listsongtitle5RowModel = list[position]
    holder.binding.listsongtitle5RowModel = listsongtitle5RowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsongtitle5RowModel>) {
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
      item: Listsongtitle5RowModel
    ) {
    }
  }

  inner class RowListsongtitle5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsongtitle5Binding = RowListsongtitle5Binding.bind(itemView)
  }
}
