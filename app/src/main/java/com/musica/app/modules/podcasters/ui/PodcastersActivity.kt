package com.musica.app.modules.podcasters.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPodcastersBinding
import com.musica.app.modules.podcasters.`data`.model.PodcastersRowModel
import com.musica.app.modules.podcasters.`data`.viewmodel.PodcastersVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PodcastersActivity : BaseActivity<ActivityPodcastersBinding>(R.layout.activity_podcasters) {
  private val viewModel: PodcastersVM by viewModels<PodcastersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val podcastersAdapter = PodcastersAdapter(viewModel.podcastersList.value?:mutableListOf())
    binding.recyclerPodcasters.adapter = podcastersAdapter
    podcastersAdapter.setOnItemClickListener(
    object : PodcastersAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PodcastersRowModel) {
        onClickRecyclerPodcasters(view, position, item)
      }
    }
    )
    viewModel.podcastersList.observe(this) {
      podcastersAdapter.updateData(it)
    }
    binding.podcastersVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerPodcasters(
    view: View,
    position: Int,
    item: PodcastersRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PODCASTERS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PodcastersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
