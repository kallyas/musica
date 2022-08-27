package com.musica.app.modules.songsnotifications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListtodayBinding
import com.musica.app.modules.songsnotifications.`data`.model.ListtodayRowModel
import kotlin.Int
import kotlin.collections.List

class ListtodayAdapter(
  var list: List<ListtodayRowModel>
) : RecyclerView.Adapter<ListtodayAdapter.RowListtodayVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtodayVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtoday,parent,false)
    return RowListtodayVH(view)
  }

  override fun onBindViewHolder(holder: RowListtodayVH, position: Int) {
    val listtodayRowModel = ListtodayRowModel()
    // TODO uncomment following line after integration with data source
    // val listtodayRowModel = list[position]
    holder.binding.listtodayRowModel = listtodayRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtodayRowModel>) {
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
      item: ListtodayRowModel
    ) {
    }
  }

  inner class RowListtodayVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtodayBinding = RowListtodayBinding.bind(itemView)
  }
}
