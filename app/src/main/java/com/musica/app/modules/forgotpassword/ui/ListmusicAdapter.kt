package com.musica.app.modules.forgotpassword.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListmusicBinding
import com.musica.app.modules.forgotpassword.`data`.model.ListmusicRowModel
import kotlin.Int
import kotlin.collections.List

class ListmusicAdapter(
  var list: List<ListmusicRowModel>
) : RecyclerView.Adapter<ListmusicAdapter.RowListmusicVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListmusicVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listmusic,parent,false)
    return RowListmusicVH(view)
  }

  override fun onBindViewHolder(holder: RowListmusicVH, position: Int) {
    val listmusicRowModel = ListmusicRowModel()
    // TODO uncomment following line after integration with data source
    // val listmusicRowModel = list[position]
    holder.binding.listmusicRowModel = listmusicRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListmusicRowModel>) {
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
      item: ListmusicRowModel
    ) {
    }
  }

  inner class RowListmusicVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListmusicBinding = RowListmusicBinding.bind(itemView)
  }
}
