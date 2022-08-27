package com.musica.app.modules.searchresultplaylist.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseFragment
import com.musica.app.databinding.FragmentSearchResultPlaylistBinding
import com.musica.app.modules.searchresultplaylist.`data`.model.GridloremipsumdolOneRowModel
import com.musica.app.modules.searchresultplaylist.`data`.viewmodel.SearchResultPlaylistVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchResultPlaylistFragment :
    BaseFragment<FragmentSearchResultPlaylistBinding>(R.layout.fragment_search_result_playlist) {
  private val viewModel: SearchResultPlaylistVM by viewModels<SearchResultPlaylistVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val gridloremipsumdolOneAdapter =
    GridloremipsumdolOneAdapter(viewModel.gridloremipsumdolOneList.value?:mutableListOf())
    binding.recyclerGridloremipsumdolOne.adapter = gridloremipsumdolOneAdapter
    gridloremipsumdolOneAdapter.setOnItemClickListener(
    object : GridloremipsumdolOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridloremipsumdolOneRowModel) {
        onClickRecyclerGridloremipsumdolOne(view, position, item)
      }
    }
    )
    viewModel.gridloremipsumdolOneList.observe(requireActivity()) {
      gridloremipsumdolOneAdapter.updateData(it)
    }
    binding.searchResultPlaylistVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridloremipsumdolOne(
    view: View,
    position: Int,
    item: GridloremipsumdolOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_RESULT_PLAYLIST_FRAGMENT"

  }
}
