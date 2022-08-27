package com.musica.app.modules.popularartists.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPopularArtistsBinding
import com.musica.app.modules.popularartists.`data`.model.GridartistsnameRowModel
import com.musica.app.modules.popularartists.`data`.viewmodel.PopularArtistsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PopularArtistsActivity :
    BaseActivity<ActivityPopularArtistsBinding>(R.layout.activity_popular_artists) {
  private val viewModel: PopularArtistsVM by viewModels<PopularArtistsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridartistsnameAdapter =
    GridartistsnameAdapter(viewModel.gridartistsnameList.value?:mutableListOf())
    binding.recyclerGridartistsname.adapter = gridartistsnameAdapter
    gridartistsnameAdapter.setOnItemClickListener(
    object : GridartistsnameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridartistsnameRowModel) {
        onClickRecyclerGridartistsname(view, position, item)
      }
    }
    )
    viewModel.gridartistsnameList.observe(this) {
      gridartistsnameAdapter.updateData(it)
    }
    binding.popularArtistsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerGridartistsname(
    view: View,
    position: Int,
    item: GridartistsnameRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "POPULAR_ARTISTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PopularArtistsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
