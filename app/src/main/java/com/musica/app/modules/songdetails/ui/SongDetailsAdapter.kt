package com.musica.app.modules.songdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowSongDetailsBinding
import com.musica.app.modules.songdetails.`data`.model.SongDetailsRowModel
import kotlin.Int
import kotlin.collections.List

class SongDetailsAdapter(
  var list: List<SongDetailsRowModel>
) : RecyclerView.Adapter<SongDetailsAdapter.RowSongDetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSongDetailsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_song_details,parent,false)
    return RowSongDetailsVH(view)
  }

  override fun onBindViewHolder(holder: RowSongDetailsVH, position: Int) {
    val songDetailsRowModel = SongDetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val songDetailsRowModel = list[position]
    holder.binding.songDetailsRowModel = songDetailsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SongDetailsRowModel>) {
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
      item: SongDetailsRowModel
    ) {
    }
  }

  inner class RowSongDetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSongDetailsBinding = RowSongDetailsBinding.bind(itemView)
  }
}
