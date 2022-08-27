package com.musica.app.modules.newreleases.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityNewReleasesBinding
import com.musica.app.modules.newreleases.`data`.model.NewReleases1RowModel
import com.musica.app.modules.newreleases.`data`.model.NewReleasesRowModel
import com.musica.app.modules.newreleases.`data`.viewmodel.NewReleasesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NewReleasesActivity : BaseActivity<ActivityNewReleasesBinding>(R.layout.activity_new_releases)
    {
  private val viewModel: NewReleasesVM by viewModels<NewReleasesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val newReleasesAdapter =
    NewReleasesAdapter(viewModel.newReleasesList.value?:mutableListOf())
    binding.recyclerNewReleases.adapter = newReleasesAdapter
    newReleasesAdapter.setOnItemClickListener(
    object : NewReleasesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NewReleasesRowModel) {
        onClickRecyclerNewReleases(view, position, item)
      }
    }
    )
    viewModel.newReleasesList.observe(this) {
      newReleasesAdapter.updateData(it)
    }
    val newReleases1Adapter =
    NewReleases1Adapter(viewModel.newReleases1List.value?:mutableListOf())
    binding.recyclerNewReleases1.adapter = newReleases1Adapter
    newReleases1Adapter.setOnItemClickListener(
    object : NewReleases1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NewReleases1RowModel) {
        onClickRecyclerNewReleases1(view, position, item)
      }
    }
    )
    viewModel.newReleases1List.observe(this) {
      newReleases1Adapter.updateData(it)
    }
    binding.newReleasesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerNewReleases(
    view: View,
    position: Int,
    item: NewReleasesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerNewReleases1(
    view: View,
    position: Int,
    item: NewReleases1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NEW_RELEASES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NewReleasesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
