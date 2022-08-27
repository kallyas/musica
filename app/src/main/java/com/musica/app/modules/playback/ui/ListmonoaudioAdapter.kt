package com.musica.app.modules.playback.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListmonoaudioBinding
import com.musica.app.modules.playback.`data`.model.ListmonoaudioRowModel
import kotlin.Int
import kotlin.collections.List

class ListmonoaudioAdapter(
  var list: List<ListmonoaudioRowModel>
) : RecyclerView.Adapter<ListmonoaudioAdapter.RowListmonoaudioVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmonoaudioVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmonoaudio,parent,false)
    return RowListmonoaudioVH(view)
  }

  override fun onBindViewHolder(holder: RowListmonoaudioVH, position: Int) {
    val listmonoaudioRowModel = ListmonoaudioRowModel()
    // TODO uncomment following line after integration with data source
    // val listmonoaudioRowModel = list[position]
    holder.binding.listmonoaudioRowModel = listmonoaudioRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmonoaudioRowModel>) {
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
      item: ListmonoaudioRowModel
    ) {
    }
  }

  inner class RowListmonoaudioVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmonoaudioBinding = RowListmonoaudioBinding.bind(itemView)
  }
}
