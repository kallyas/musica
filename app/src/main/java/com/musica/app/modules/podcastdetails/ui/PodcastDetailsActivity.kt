package com.musica.app.modules.podcastdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityPodcastDetailsBinding
import com.musica.app.modules.podcastdetails.`data`.model.Listpodcasttitle3RowModel
import com.musica.app.modules.podcastdetails.`data`.viewmodel.PodcastDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PodcastDetailsActivity :
    BaseActivity<ActivityPodcastDetailsBinding>(R.layout.activity_podcast_details) {
  private val viewModel: PodcastDetailsVM by viewModels<PodcastDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listpodcasttitleAdapter =
    ListpodcasttitleAdapter(viewModel.listpodcasttitleList.value?:mutableListOf())
    binding.recyclerListpodcasttitle.adapter = listpodcasttitleAdapter
    listpodcasttitleAdapter.setOnItemClickListener(
    object : ListpodcasttitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listpodcasttitle3RowModel) {
        onClickRecyclerListpodcasttitle(view, position, item)
      }
    }
    )
    viewModel.listpodcasttitleList.observe(this) {
      listpodcasttitleAdapter.updateData(it)
    }
    binding.podcastDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListpodcasttitle(
    view: View,
    position: Int,
    item: Listpodcasttitle3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PODCAST_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PodcastDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
