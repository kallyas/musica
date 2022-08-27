package com.musica.app.modules.searchresiltprofile.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseFragment
import com.musica.app.databinding.FragmentSearchResiltProfileBinding
import com.musica.app.modules.searchresiltprofile.`data`.model.ListprofilenameRowModel
import com.musica.app.modules.searchresiltprofile.`data`.viewmodel.SearchResiltProfileVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchResiltProfileFragment :
    BaseFragment<FragmentSearchResiltProfileBinding>(R.layout.fragment_search_resilt_profile) {
  private val viewModel: SearchResiltProfileVM by viewModels<SearchResiltProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listprofilenameAdapter =
    ListprofilenameAdapter(viewModel.listprofilenameList.value?:mutableListOf())
    binding.recyclerListprofilename.adapter = listprofilenameAdapter
    listprofilenameAdapter.setOnItemClickListener(
    object : ListprofilenameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListprofilenameRowModel) {
        onClickRecyclerListprofilename(view, position, item)
      }
    }
    )
    viewModel.listprofilenameList.observe(requireActivity()) {
      listprofilenameAdapter.updateData(it)
    }
    binding.searchResiltProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListprofilename(
    view: View,
    position: Int,
    item: ListprofilenameRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_RESILT_PROFILE_FRAGMENT"

  }
}
