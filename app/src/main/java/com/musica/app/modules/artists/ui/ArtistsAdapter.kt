package com.musica.app.modules.artists.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowArtistsBinding
import com.musica.app.modules.artists.`data`.model.ArtistsRowModel
import kotlin.Int
import kotlin.collections.List

class ArtistsAdapter(
  var list: List<ArtistsRowModel>
) : RecyclerView.Adapter<ArtistsAdapter.RowArtistsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowArtistsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_artists,parent,false)
    return RowArtistsVH(view)
  }

  override fun onBindViewHolder(holder: RowArtistsVH, position: Int) {
    val artistsRowModel = ArtistsRowModel()
    // TODO uncomment following line after integration with data source
    // val artistsRowModel = list[position]
    holder.binding.artistsRowModel = artistsRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ArtistsRowModel>) {
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
      item: ArtistsRowModel
    ) {
    }
  }

  inner class RowArtistsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowArtistsBinding = RowArtistsBinding.bind(itemView)
  }
}
