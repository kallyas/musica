package com.musica.app.modules.yourlikes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowYourLikesBinding
import com.musica.app.modules.yourlikes.`data`.model.YourLikesRowModel
import kotlin.Int
import kotlin.collections.List

class YourLikesAdapter(
  var list: List<YourLikesRowModel>
) : RecyclerView.Adapter<YourLikesAdapter.RowYourLikesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowYourLikesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_your_likes,parent,false)
    return RowYourLikesVH(view)
  }

  override fun onBindViewHolder(holder: RowYourLikesVH, position: Int) {
    val yourLikesRowModel = YourLikesRowModel()
    // TODO uncomment following line after integration with data source
    // val yourLikesRowModel = list[position]
    holder.binding.yourLikesRowModel = yourLikesRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<YourLikesRowModel>) {
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
      item: YourLikesRowModel
    ) {
    }
  }

  inner class RowYourLikesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowYourLikesBinding = RowYourLikesBinding.bind(itemView)
  }
}
