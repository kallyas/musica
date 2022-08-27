package com.musica.app.modules.playlists.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowPlaylistsBinding
import com.musica.app.modules.playlists.`data`.model.PlaylistsRowModel
import kotlin.Int
import kotlin.collections.List

class PlaylistsAdapter(
  var list: List<PlaylistsRowModel>
) : RecyclerView.Adapter<PlaylistsAdapter.RowPlaylistsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPlaylistsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_playlists,parent,false)
    return RowPlaylistsVH(view)
  }

  override fun onBindViewHolder(holder: RowPlaylistsVH, position: Int) {
    val playlistsRowModel = PlaylistsRowModel()
    // TODO uncomment following line after integration with data source
    // val playlistsRowModel = list[position]
    holder.binding.playlistsRowModel = playlistsRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PlaylistsRowModel>) {
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
      item: PlaylistsRowModel
    ) {
    }
  }

  inner class RowPlaylistsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPlaylistsBinding = RowPlaylistsBinding.bind(itemView)
  }
}
