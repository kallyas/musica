package com.musica.app.modules.trendingnow.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowTrendingNowBinding
import com.musica.app.modules.trendingnow.`data`.model.TrendingNowRowModel
import kotlin.Int
import kotlin.collections.List

class TrendingNowAdapter(
  var list: List<TrendingNowRowModel>
) : RecyclerView.Adapter<TrendingNowAdapter.RowTrendingNowVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTrendingNowVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_trending_now,parent,false)
    return RowTrendingNowVH(view)
  }

  override fun onBindViewHolder(holder: RowTrendingNowVH, position: Int) {
    val trendingNowRowModel = TrendingNowRowModel()
    // TODO uncomment following line after integration with data source
    // val trendingNowRowModel = list[position]
    holder.binding.trendingNowRowModel = trendingNowRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TrendingNowRowModel>) {
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
      item: TrendingNowRowModel
    ) {
    }
  }

  inner class RowTrendingNowVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTrendingNowBinding = RowTrendingNowBinding.bind(itemView)
  }
}
