package com.musica.app.modules.podcastsnotifications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListpodcasttitle4Binding
import com.musica.app.modules.podcastsnotifications.`data`.model.Listpodcasttitle4RowModel
import kotlin.Int
import kotlin.collections.List

class ListpodcasttitleAdapter(
  var list: List<Listpodcasttitle4RowModel>
) : RecyclerView.Adapter<ListpodcasttitleAdapter.RowListpodcasttitle4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpodcasttitle4VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpodcasttitle4,parent,false)
    return RowListpodcasttitle4VH(view)
  }

  override fun onBindViewHolder(holder: RowListpodcasttitle4VH, position: Int) {
    val listpodcasttitle4RowModel = Listpodcasttitle4RowModel()
    // TODO uncomment following line after integration with data source
    // val listpodcasttitle4RowModel = list[position]
    holder.binding.listpodcasttitle4RowModel = listpodcasttitle4RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listpodcasttitle4RowModel>) {
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
      item: Listpodcasttitle4RowModel
    ) {
    }
  }

  inner class RowListpodcasttitle4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpodcasttitle4Binding = RowListpodcasttitle4Binding.bind(itemView)
  }
}
