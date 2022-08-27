package com.musica.app.modules.podcastepisodedetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPodcastEpisodeDetailsBinding
import com.musica.app.modules.podcastepisodedetails.`data`.viewmodel.PodcastEpisodeDetailsVM
import kotlin.String
import kotlin.Unit

class PodcastEpisodeDetailsActivity :
    BaseActivity<ActivityPodcastEpisodeDetailsBinding>(R.layout.activity_podcast_episode_details) {
  private val viewModel: PodcastEpisodeDetailsVM by viewModels<PodcastEpisodeDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.podcastEpisodeDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PODCAST_EPISODE_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PodcastEpisodeDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
