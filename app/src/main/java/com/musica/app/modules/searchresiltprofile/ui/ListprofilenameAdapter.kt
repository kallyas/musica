package com.musica.app.modules.searchresiltprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListprofilenameBinding
import com.musica.app.modules.searchresiltprofile.`data`.model.ListprofilenameRowModel
import kotlin.Int
import kotlin.collections.List

class ListprofilenameAdapter(
  var list: List<ListprofilenameRowModel>
) : RecyclerView.Adapter<ListprofilenameAdapter.RowListprofilenameVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprofilenameVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprofilename,parent,false)
    return RowListprofilenameVH(view)
  }

  override fun onBindViewHolder(holder: RowListprofilenameVH, position: Int) {
    val listprofilenameRowModel = ListprofilenameRowModel()
    // TODO uncomment following line after integration with data source
    // val listprofilenameRowModel = list[position]
    holder.binding.listprofilenameRowModel = listprofilenameRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListprofilenameRowModel>) {
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
      item: ListprofilenameRowModel
    ) {
    }
  }

  inner class RowListprofilenameVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprofilenameBinding = RowListprofilenameBinding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListprofilenameRowModel())
      }
    }
  }
}
