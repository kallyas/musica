package com.musica.app.modules.downloadsone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowDownloadsOneBinding
import com.musica.app.modules.downloadsone.`data`.model.DownloadsOneRowModel
import kotlin.Int
import kotlin.collections.List

class DownloadsOneAdapter(
  var list: List<DownloadsOneRowModel>
) : RecyclerView.Adapter<DownloadsOneAdapter.RowDownloadsOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDownloadsOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_downloads_one,parent,false)
    return RowDownloadsOneVH(view)
  }

  override fun onBindViewHolder(holder: RowDownloadsOneVH, position: Int) {
    val downloadsOneRowModel = DownloadsOneRowModel()
    // TODO uncomment following line after integration with data source
    // val downloadsOneRowModel = list[position]
    holder.binding.downloadsOneRowModel = downloadsOneRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DownloadsOneRowModel>) {
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
      item: DownloadsOneRowModel
    ) {
    }
  }

  inner class RowDownloadsOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDownloadsOneBinding = RowDownloadsOneBinding.bind(itemView)
  }
}
