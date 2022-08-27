package com.musica.app.modules.historymusic.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowHistoryMusicBinding
import com.musica.app.modules.historymusic.`data`.model.HistoryMusicRowModel
import kotlin.Int
import kotlin.collections.List

class HistoryMusicAdapter(
  var list: List<HistoryMusicRowModel>
) : RecyclerView.Adapter<HistoryMusicAdapter.RowHistoryMusicVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHistoryMusicVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_history_music,parent,false)
    return RowHistoryMusicVH(view)
  }

  override fun onBindViewHolder(holder: RowHistoryMusicVH, position: Int) {
    val historyMusicRowModel = HistoryMusicRowModel()
    // TODO uncomment following line after integration with data source
    // val historyMusicRowModel = list[position]
    holder.binding.historyMusicRowModel = historyMusicRowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HistoryMusicRowModel>) {
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
      item: HistoryMusicRowModel
    ) {
    }
  }

  inner class RowHistoryMusicVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHistoryMusicBinding = RowHistoryMusicBinding.bind(itemView)
  }
}
