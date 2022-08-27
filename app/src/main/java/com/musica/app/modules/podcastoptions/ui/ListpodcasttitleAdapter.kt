package com.musica.app.modules.podcastoptions.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListpodcasttitleBinding
import com.musica.app.modules.podcastoptions.`data`.model.ListpodcasttitleRowModel
import kotlin.Int
import kotlin.collections.List

class ListpodcasttitleAdapter(
  var list: List<ListpodcasttitleRowModel>
) : RecyclerView.Adapter<ListpodcasttitleAdapter.RowListpodcasttitleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpodcasttitleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpodcasttitle,parent,false)
    return RowListpodcasttitleVH(view)
  }

  override fun onBindViewHolder(holder: RowListpodcasttitleVH, position: Int) {
    val listpodcasttitleRowModel = ListpodcasttitleRowModel()
    // TODO uncomment following line after integration with data source
    // val listpodcasttitleRowModel = list[position]
    holder.binding.listpodcasttitleRowModel = listpodcasttitleRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListpodcasttitleRowModel>) {
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
      item: ListpodcasttitleRowModel
    ) {
    }
  }

  inner class RowListpodcasttitleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpodcasttitleBinding = RowListpodcasttitleBinding.bind(itemView)
  }
}
