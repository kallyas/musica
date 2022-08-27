package com.musica.app.modules.followartists.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowFollowArtistsBinding
import com.musica.app.modules.followartists.`data`.model.FollowArtistsRowModel
import kotlin.Int
import kotlin.collections.List

class FollowArtistsAdapter(
  var list: List<FollowArtistsRowModel>
) : RecyclerView.Adapter<FollowArtistsAdapter.RowFollowArtistsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFollowArtistsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_follow_artists,parent,false)
    return RowFollowArtistsVH(view)
  }

  override fun onBindViewHolder(holder: RowFollowArtistsVH, position: Int) {
    val followArtistsRowModel = FollowArtistsRowModel()
    // TODO uncomment following line after integration with data source
    // val followArtistsRowModel = list[position]
    holder.binding.followArtistsRowModel = followArtistsRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FollowArtistsRowModel>) {
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
      item: FollowArtistsRowModel
    ) {
    }
  }

  inner class RowFollowArtistsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFollowArtistsBinding = RowFollowArtistsBinding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, FollowArtistsRowModel())
      }
    }
  }
}
