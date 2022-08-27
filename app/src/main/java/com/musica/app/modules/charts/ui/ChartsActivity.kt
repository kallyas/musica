package com.musica.app.modules.charts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityChartsBinding
import com.musica.app.modules.charts.`data`.model.Listprice1RowModel
import com.musica.app.modules.charts.`data`.model.ListpriceFourRowModel
import com.musica.app.modules.charts.`data`.model.ListpriceTwoRowModel
import com.musica.app.modules.charts.`data`.viewmodel.ChartsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChartsActivity : BaseActivity<ActivityChartsBinding>(R.layout.activity_charts) {
  private val viewModel: ChartsVM by viewModels<ChartsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listpriceAdapter = ListpriceAdapter(viewModel.listpriceList.value?:mutableListOf())
    binding.recyclerListprice.adapter = listpriceAdapter
    listpriceAdapter.setOnItemClickListener(
    object : ListpriceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprice1RowModel) {
        onClickRecyclerListprice(view, position, item)
      }
    }
    )
    viewModel.listpriceList.observe(this) {
      listpriceAdapter.updateData(it)
    }
    val listpriceTwoAdapter =
    ListpriceTwoAdapter(viewModel.listpriceTwoList.value?:mutableListOf())
    binding.recyclerListpriceTwo.adapter = listpriceTwoAdapter
    listpriceTwoAdapter.setOnItemClickListener(
    object : ListpriceTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpriceTwoRowModel) {
        onClickRecyclerListpriceTwo(view, position, item)
      }
    }
    )
    viewModel.listpriceTwoList.observe(this) {
      listpriceTwoAdapter.updateData(it)
    }
    val listpriceFourAdapter =
    ListpriceFourAdapter(viewModel.listpriceFourList.value?:mutableListOf())
    binding.recyclerListpriceFour.adapter = listpriceFourAdapter
    listpriceFourAdapter.setOnItemClickListener(
    object : ListpriceFourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpriceFourRowModel) {
        onClickRecyclerListpriceFour(view, position, item)
      }
    }
    )
    viewModel.listpriceFourList.observe(this) {
      listpriceFourAdapter.updateData(it)
    }
    binding.chartsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListprice(
    view: View,
    position: Int,
    item: Listprice1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListpriceTwo(
    view: View,
    position: Int,
    item: ListpriceTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListpriceFour(
    view: View,
    position: Int,
    item: ListpriceFourRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHARTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChartsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
