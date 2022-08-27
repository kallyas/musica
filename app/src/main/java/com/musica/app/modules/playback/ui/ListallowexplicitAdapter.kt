package com.musica.app.modules.playback.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListallowexplicitBinding
import com.musica.app.modules.playback.`data`.model.ListallowexplicitRowModel
import kotlin.Int
import kotlin.collections.List

class ListallowexplicitAdapter(
  var list: List<ListallowexplicitRowModel>
) : RecyclerView.Adapter<ListallowexplicitAdapter.RowListallowexplicitVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListallowexplicitVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listallowexplicit,parent,false)
    return RowListallowexplicitVH(view)
  }

  override fun onBindViewHolder(holder: RowListallowexplicitVH, position: Int) {
    val listallowexplicitRowModel = ListallowexplicitRowModel()
    // TODO uncomment following line after integration with data source
    // val listallowexplicitRowModel = list[position]
    holder.binding.listallowexplicitRowModel = listallowexplicitRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListallowexplicitRowModel>) {
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
      item: ListallowexplicitRowModel
    ) {
    }
  }

  inner class RowListallowexplicitVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListallowexplicitBinding = RowListallowexplicitBinding.bind(itemView)
  }
}
