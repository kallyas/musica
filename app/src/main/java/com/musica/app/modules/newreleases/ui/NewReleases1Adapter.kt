package com.musica.app.modules.newreleases.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowNewReleases1Binding
import com.musica.app.modules.newreleases.`data`.model.NewReleases1RowModel
import kotlin.Int
import kotlin.collections.List

class NewReleases1Adapter(
  var list: List<NewReleases1RowModel>
) : RecyclerView.Adapter<NewReleases1Adapter.RowNewReleases1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNewReleases1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_new_releases1,parent,false)
    return RowNewReleases1VH(view)
  }

  override fun onBindViewHolder(holder: RowNewReleases1VH, position: Int) {
    val newReleases1RowModel = NewReleases1RowModel()
    // TODO uncomment following line after integration with data source
    // val newReleases1RowModel = list[position]
    holder.binding.newReleases1RowModel = newReleases1RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NewReleases1RowModel>) {
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
      item: NewReleases1RowModel
    ) {
    }
  }

  inner class RowNewReleases1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNewReleases1Binding = RowNewReleases1Binding.bind(itemView)
  }
}
