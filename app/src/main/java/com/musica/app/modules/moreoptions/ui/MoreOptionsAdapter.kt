package com.musica.app.modules.moreoptions.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowMoreOptionsBinding
import com.musica.app.modules.moreoptions.`data`.model.MoreOptionsRowModel
import kotlin.Int
import kotlin.collections.List

class MoreOptionsAdapter(
  var list: List<MoreOptionsRowModel>
) : RecyclerView.Adapter<MoreOptionsAdapter.RowMoreOptionsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMoreOptionsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_more_options,parent,false)
    return RowMoreOptionsVH(view)
  }

  override fun onBindViewHolder(holder: RowMoreOptionsVH, position: Int) {
    val moreOptionsRowModel = MoreOptionsRowModel()
    // TODO uncomment following line after integration with data source
    // val moreOptionsRowModel = list[position]
    holder.binding.moreOptionsRowModel = moreOptionsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MoreOptionsRowModel>) {
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
      item: MoreOptionsRowModel
    ) {
    }
  }

  inner class RowMoreOptionsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMoreOptionsBinding = RowMoreOptionsBinding.bind(itemView)
  }
}
