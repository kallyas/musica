package com.musica.app.modules.searchresultpodcast.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListpodcasttitle2Binding
import com.musica.app.modules.searchresultpodcast.`data`.model.Listpodcasttitle2RowModel
import kotlin.Int
import kotlin.collections.List

class ListpodcasttitleAdapter(
  var list: List<Listpodcasttitle2RowModel>
) : RecyclerView.Adapter<ListpodcasttitleAdapter.RowListpodcasttitle2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpodcasttitle2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpodcasttitle2,parent,false)
    return RowListpodcasttitle2VH(view)
  }

  override fun onBindViewHolder(holder: RowListpodcasttitle2VH, position: Int) {
    val listpodcasttitle2RowModel = Listpodcasttitle2RowModel()
    // TODO uncomment following line after integration with data source
    // val listpodcasttitle2RowModel = list[position]
    holder.binding.listpodcasttitle2RowModel = listpodcasttitle2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listpodcasttitle2RowModel>) {
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
      item: Listpodcasttitle2RowModel
    ) {
    }
  }

  inner class RowListpodcasttitle2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpodcasttitle2Binding = RowListpodcasttitle2Binding.bind(itemView)
  }
}
