package com.musica.app.modules.searchresultssongs.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListsongtitleBinding
import com.musica.app.modules.searchresultssongs.`data`.model.ListsongtitleRowModel
import kotlin.Int
import kotlin.collections.List

class ListsongtitleAdapter(
  var list: List<ListsongtitleRowModel>
) : RecyclerView.Adapter<ListsongtitleAdapter.RowListsongtitleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsongtitleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsongtitle,parent,false)
    return RowListsongtitleVH(view)
  }

  override fun onBindViewHolder(holder: RowListsongtitleVH, position: Int) {
    val listsongtitleRowModel = ListsongtitleRowModel()
    // TODO uncomment following line after integration with data source
    // val listsongtitleRowModel = list[position]
    holder.binding.listsongtitleRowModel = listsongtitleRowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsongtitleRowModel>) {
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
      item: ListsongtitleRowModel
    ) {
    }
  }

  inner class RowListsongtitleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsongtitleBinding = RowListsongtitleBinding.bind(itemView)
  }
}
