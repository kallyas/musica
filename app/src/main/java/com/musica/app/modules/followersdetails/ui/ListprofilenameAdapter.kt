package com.musica.app.modules.followersdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musica.app.R
import com.musica.app.databinding.RowListprofilename1Binding
import com.musica.app.modules.followersdetails.`data`.model.Listprofilename1RowModel
import kotlin.Int
import kotlin.collections.List

class ListprofilenameAdapter(
  var list: List<Listprofilename1RowModel>
) : RecyclerView.Adapter<ListprofilenameAdapter.RowListprofilename1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprofilename1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprofilename1,parent,false)
    return RowListprofilename1VH(view)
  }

  override fun onBindViewHolder(holder: RowListprofilename1VH, position: Int) {
    val listprofilename1RowModel = Listprofilename1RowModel()
    // TODO uncomment following line after integration with data source
    // val listprofilename1RowModel = list[position]
    holder.binding.listprofilename1RowModel = listprofilename1RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprofilename1RowModel>) {
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
      item: Listprofilename1RowModel
    ) {
    }
  }

  inner class RowListprofilename1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprofilename1Binding = RowListprofilename1Binding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listprofilename1RowModel())
      }
    }
  }
}
