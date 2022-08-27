package com.musica.app.modules.searchresultpodcast.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseFragment
import com.musica.app.databinding.FragmentSearchResultPodcastBinding
import com.musica.app.modules.searchresultpodcast.`data`.model.Listpodcasttitle2RowModel
import com.musica.app.modules.searchresultpodcast.`data`.viewmodel.SearchResultPodcastVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchResultPodcastFragment :
    BaseFragment<FragmentSearchResultPodcastBinding>(R.layout.fragment_search_result_podcast) {
  private val viewModel: SearchResultPodcastVM by viewModels<SearchResultPodcastVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listpodcasttitleAdapter =
    ListpodcasttitleAdapter(viewModel.listpodcasttitleList.value?:mutableListOf())
    binding.recyclerListpodcasttitle.adapter = listpodcasttitleAdapter
    listpodcasttitleAdapter.setOnItemClickListener(
    object : ListpodcasttitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listpodcasttitle2RowModel) {
        onClickRecyclerListpodcasttitle(view, position, item)
      }
    }
    )
    viewModel.listpodcasttitleList.observe(requireActivity()) {
      listpodcasttitleAdapter.updateData(it)
    }
    binding.searchResultPodcastVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListpodcasttitle(
    view: View,
    position: Int,
    item: Listpodcasttitle2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_RESULT_PODCAST_FRAGMENT"

  }
}
