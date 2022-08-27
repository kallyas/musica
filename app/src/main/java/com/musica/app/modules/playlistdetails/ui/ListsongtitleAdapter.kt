package com.musica.app.modules.playlistdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListsongtitle2Binding
import com.musica.app.modules.playlistdetails.`data`.model.Listsongtitle2RowModel
import kotlin.Int
import kotlin.collections.List

class ListsongtitleAdapter(
  var list: List<Listsongtitle2RowModel>
) : RecyclerView.Adapter<ListsongtitleAdapter.RowListsongtitle2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsongtitle2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsongtitle2,parent,false)
    return RowListsongtitle2VH(view)
  }

  override fun onBindViewHolder(holder: RowListsongtitle2VH, position: Int) {
    val listsongtitle2RowModel = Listsongtitle2RowModel()
    // TODO uncomment following line after integration with data source
    // val listsongtitle2RowModel = list[position]
    holder.binding.listsongtitle2RowModel = listsongtitle2RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsongtitle2RowModel>) {
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
      item: Listsongtitle2RowModel
    ) {
    }
  }

  inner class RowListsongtitle2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsongtitle2Binding = RowListsongtitle2Binding.bind(itemView)
  }
}
