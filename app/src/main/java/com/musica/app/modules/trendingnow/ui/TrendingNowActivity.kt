package com.musica.app.modules.trendingnow.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityTrendingNowBinding
import com.musica.app.modules.trendingnow.`data`.model.TrendingNowRowModel
import com.musica.app.modules.trendingnow.`data`.viewmodel.TrendingNowVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TrendingNowActivity : BaseActivity<ActivityTrendingNowBinding>(R.layout.activity_trending_now)
    {
  private val viewModel: TrendingNowVM by viewModels<TrendingNowVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val trendingNowAdapter =
    TrendingNowAdapter(viewModel.trendingNowList.value?:mutableListOf())
    binding.recyclerTrendingNow.adapter = trendingNowAdapter
    trendingNowAdapter.setOnItemClickListener(
    object : TrendingNowAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TrendingNowRowModel) {
        onClickRecyclerTrendingNow(view, position, item)
      }
    }
    )
    viewModel.trendingNowList.observe(this) {
      trendingNowAdapter.updateData(it)
    }
    binding.trendingNowVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerTrendingNow(
    view: View,
    position: Int,
    item: TrendingNowRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TRENDING_NOW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TrendingNowActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
