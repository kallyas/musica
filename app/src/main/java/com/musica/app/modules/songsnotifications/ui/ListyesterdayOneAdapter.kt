package com.musica.app.modules.songsnotifications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListyesterdayOneBinding
import com.musica.app.modules.songsnotifications.`data`.model.ListyesterdayOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListyesterdayOneAdapter(
  var list: List<ListyesterdayOneRowModel>
) : RecyclerView.Adapter<ListyesterdayOneAdapter.RowListyesterdayOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListyesterdayOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listyesterday_one,parent,false)
    return RowListyesterdayOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListyesterdayOneVH, position: Int) {
    val listyesterdayOneRowModel = ListyesterdayOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listyesterdayOneRowModel = list[position]
    holder.binding.listyesterdayOneRowModel = listyesterdayOneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListyesterdayOneRowModel>) {
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
      item: ListyesterdayOneRowModel
    ) {
    }
  }

  inner class RowListyesterdayOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListyesterdayOneBinding = RowListyesterdayOneBinding.bind(itemView)
  }
}
