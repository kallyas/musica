package com.musica.app.modules.newreleases.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowNewReleasesBinding
import com.musica.app.modules.newreleases.`data`.model.NewReleasesRowModel
import kotlin.Int
import kotlin.collections.List

class NewReleasesAdapter(
  var list: List<NewReleasesRowModel>
) : RecyclerView.Adapter<NewReleasesAdapter.RowNewReleasesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNewReleasesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_new_releases,parent,false)
    return RowNewReleasesVH(view)
  }

  override fun onBindViewHolder(holder: RowNewReleasesVH, position: Int) {
    val newReleasesRowModel = NewReleasesRowModel()
    // TODO uncomment following line after integration with data source
    // val newReleasesRowModel = list[position]
    holder.binding.newReleasesRowModel = newReleasesRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NewReleasesRowModel>) {
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
      item: NewReleasesRowModel
    ) {
    }
  }

  inner class RowNewReleasesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNewReleasesBinding = RowNewReleasesBinding.bind(itemView)
  }
}
