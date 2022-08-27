package com.musica.app.modules.artistdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowArtistDetailsBinding
import com.musica.app.modules.artistdetails.`data`.model.ArtistDetailsRowModel
import kotlin.Int
import kotlin.collections.List

class ArtistDetailsAdapter(
  var list: List<ArtistDetailsRowModel>
) : RecyclerView.Adapter<ArtistDetailsAdapter.RowArtistDetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowArtistDetailsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_artist_details,parent,false)
    return RowArtistDetailsVH(view)
  }

  override fun onBindViewHolder(holder: RowArtistDetailsVH, position: Int) {
    val artistDetailsRowModel = ArtistDetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val artistDetailsRowModel = list[position]
    holder.binding.artistDetailsRowModel = artistDetailsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ArtistDetailsRowModel>) {
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
      item: ArtistDetailsRowModel
    ) {
    }
  }

  inner class RowArtistDetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowArtistDetailsBinding = RowArtistDetailsBinding.bind(itemView)
  }
}
