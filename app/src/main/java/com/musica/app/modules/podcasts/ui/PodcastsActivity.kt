package com.musica.app.modules.podcasts.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPodcastsBinding
import com.musica.app.modules.podcasts.`data`.model.PodcastsRowModel
import com.musica.app.modules.podcasts.`data`.viewmodel.PodcastsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PodcastsActivity : BaseActivity<ActivityPodcastsBinding>(R.layout.activity_podcasts) {
  private val viewModel: PodcastsVM by viewModels<PodcastsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val podcastsAdapter = PodcastsAdapter(viewModel.podcastsList.value?:mutableListOf())
    binding.recyclerPodcasts.adapter = podcastsAdapter
    podcastsAdapter.setOnItemClickListener(
    object : PodcastsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PodcastsRowModel) {
        onClickRecyclerPodcasts(view, position, item)
      }
    }
    )
    viewModel.podcastsList.observe(this) {
      podcastsAdapter.updateData(it)
    }
    binding.podcastsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerPodcasts(
    view: View,
    position: Int,
    item: PodcastsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PODCASTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PodcastsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
