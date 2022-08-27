package com.musica.app.modules.searchresulttop.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListsongtitleTwoBinding
import com.musica.app.modules.searchresulttop.`data`.model.ListsongtitleTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListsongtitleTwoAdapter(
  var list: List<ListsongtitleTwoRowModel>
) : RecyclerView.Adapter<ListsongtitleTwoAdapter.RowListsongtitleTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsongtitleTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsongtitle_two,parent,false)
    return RowListsongtitleTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListsongtitleTwoVH, position: Int) {
    val listsongtitleTwoRowModel = ListsongtitleTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listsongtitleTwoRowModel = list[position]
    holder.binding.listsongtitleTwoRowModel = listsongtitleTwoRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsongtitleTwoRowModel>) {
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
      item: ListsongtitleTwoRowModel
    ) {
    }
  }

  inner class RowListsongtitleTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsongtitleTwoBinding = RowListsongtitleTwoBinding.bind(itemView)
  }
}
