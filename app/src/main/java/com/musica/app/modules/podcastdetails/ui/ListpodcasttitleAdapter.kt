package com.musica.app.modules.podcastdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListpodcasttitle3Binding
import com.musica.app.modules.podcastdetails.`data`.model.Listpodcasttitle3RowModel
import kotlin.Int
import kotlin.collections.List

class ListpodcasttitleAdapter(
  var list: List<Listpodcasttitle3RowModel>
) : RecyclerView.Adapter<ListpodcasttitleAdapter.RowListpodcasttitle3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpodcasttitle3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpodcasttitle3,parent,false)
    return RowListpodcasttitle3VH(view)
  }

  override fun onBindViewHolder(holder: RowListpodcasttitle3VH, position: Int) {
    val listpodcasttitle3RowModel = Listpodcasttitle3RowModel()
    // TODO uncomment following line after integration with data source
    // val listpodcasttitle3RowModel = list[position]
    holder.binding.listpodcasttitle3RowModel = listpodcasttitle3RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listpodcasttitle3RowModel>) {
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
      item: Listpodcasttitle3RowModel
    ) {
    }
  }

  inner class RowListpodcasttitle3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpodcasttitle3Binding = RowListpodcasttitle3Binding.bind(itemView)
  }
}
