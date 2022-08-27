package com.musica.app.modules.podcastoptions.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseFragment
import com.musica.app.databinding.FragmentPodcastOptionsBinding
import com.musica.app.modules.podcastoptions.`data`.model.ListpodcasttitleRowModel
import com.musica.app.modules.podcastoptions.`data`.viewmodel.PodcastOptionsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PodcastOptionsFragment :
    BaseFragment<FragmentPodcastOptionsBinding>(R.layout.fragment_podcast_options) {
  private val viewModel: PodcastOptionsVM by viewModels<PodcastOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listpodcasttitleAdapter =
    ListpodcasttitleAdapter(viewModel.listpodcasttitleList.value?:mutableListOf())
    binding.recyclerListpodcasttitle.adapter = listpodcasttitleAdapter
    listpodcasttitleAdapter.setOnItemClickListener(
    object : ListpodcasttitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpodcasttitleRowModel) {
        onClickRecyclerListpodcasttitle(view, position, item)
      }
    }
    )
    viewModel.listpodcasttitleList.observe(requireActivity()) {
      listpodcasttitleAdapter.updateData(it)
    }
    binding.podcastOptionsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListpodcasttitle(
    view: View,
    position: Int,
    item: ListpodcasttitleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PODCAST_OPTIONS_FRAGMENT"

  }
}
