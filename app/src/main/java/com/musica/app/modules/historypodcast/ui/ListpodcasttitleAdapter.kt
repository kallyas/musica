package com.musica.app.modules.historypodcast.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListpodcasttitle1Binding
import com.musica.app.modules.historypodcast.`data`.model.Listpodcasttitle1RowModel
import kotlin.Int
import kotlin.collections.List

class ListpodcasttitleAdapter(
  var list: List<Listpodcasttitle1RowModel>
) : RecyclerView.Adapter<ListpodcasttitleAdapter.RowListpodcasttitle1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpodcasttitle1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpodcasttitle1,parent,false)
    return RowListpodcasttitle1VH(view)
  }

  override fun onBindViewHolder(holder: RowListpodcasttitle1VH, position: Int) {
    val listpodcasttitle1RowModel = Listpodcasttitle1RowModel()
    // TODO uncomment following line after integration with data source
    // val listpodcasttitle1RowModel = list[position]
    holder.binding.listpodcasttitle1RowModel = listpodcasttitle1RowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listpodcasttitle1RowModel>) {
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
      item: Listpodcasttitle1RowModel
    ) {
    }
  }

  inner class RowListpodcasttitle1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpodcasttitle1Binding = RowListpodcasttitle1Binding.bind(itemView)
  }
}
