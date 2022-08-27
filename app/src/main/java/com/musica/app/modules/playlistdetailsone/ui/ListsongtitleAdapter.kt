package com.musica.app.modules.playlistdetailsone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListsongtitle3Binding
import com.musica.app.modules.playlistdetailsone.`data`.model.Listsongtitle3RowModel
import kotlin.Int
import kotlin.collections.List

class ListsongtitleAdapter(
  var list: List<Listsongtitle3RowModel>
) : RecyclerView.Adapter<ListsongtitleAdapter.RowListsongtitle3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsongtitle3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsongtitle3,parent,false)
    return RowListsongtitle3VH(view)
  }

  override fun onBindViewHolder(holder: RowListsongtitle3VH, position: Int) {
    val listsongtitle3RowModel = Listsongtitle3RowModel()
    // TODO uncomment following line after integration with data source
    // val listsongtitle3RowModel = list[position]
    holder.binding.listsongtitle3RowModel = listsongtitle3RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsongtitle3RowModel>) {
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
      item: Listsongtitle3RowModel
    ) {
    }
  }

  inner class RowListsongtitle3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsongtitle3Binding = RowListsongtitle3Binding.bind(itemView)
  }
}
