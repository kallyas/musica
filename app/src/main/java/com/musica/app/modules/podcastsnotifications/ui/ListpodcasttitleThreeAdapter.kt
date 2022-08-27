package com.musica.app.modules.podcastsnotifications.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListpodcasttitleThreeBinding
import com.musica.app.modules.podcastsnotifications.`data`.model.ListpodcasttitleThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListpodcasttitleThreeAdapter(
  var list: List<ListpodcasttitleThreeRowModel>
) : RecyclerView.Adapter<ListpodcasttitleThreeAdapter.RowListpodcasttitleThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpodcasttitleThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpodcasttitle_three,parent,false)
    return RowListpodcasttitleThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListpodcasttitleThreeVH, position: Int) {
    val listpodcasttitleThreeRowModel = ListpodcasttitleThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listpodcasttitleThreeRowModel = list[position]
    holder.binding.listpodcasttitleThreeRowModel = listpodcasttitleThreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListpodcasttitleThreeRowModel>) {
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
      item: ListpodcasttitleThreeRowModel
    ) {
    }
  }

  inner class RowListpodcasttitleThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpodcasttitleThreeBinding = RowListpodcasttitleThreeBinding.bind(itemView)
  }
}
