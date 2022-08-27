package com.musica.app.modules.searchresultalbum.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySearchResultAlbumBinding
import com.musica.app.modules.searchresultalbum.`data`.model.GridloremipsumdolRowModel
import com.musica.app.modules.searchresultalbum.`data`.viewmodel.SearchResultAlbumVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchResultAlbumActivity :
    BaseActivity<ActivitySearchResultAlbumBinding>(R.layout.activity_search_result_album) {
  private val viewModel: SearchResultAlbumVM by viewModels<SearchResultAlbumVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridloremipsumdolAdapter =
    GridloremipsumdolAdapter(viewModel.gridloremipsumdolList.value?:mutableListOf())
    binding.recyclerGridloremipsumdol.adapter = gridloremipsumdolAdapter
    gridloremipsumdolAdapter.setOnItemClickListener(
    object : GridloremipsumdolAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridloremipsumdolRowModel) {
        onClickRecyclerGridloremipsumdol(view, position, item)
      }
    }
    )
    viewModel.gridloremipsumdolList.observe(this) {
      gridloremipsumdolAdapter.updateData(it)
    }
    binding.searchResultAlbumVM = viewModel
    setUpSearchViewFilledSearchListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridloremipsumdol(
    view: View,
    position: Int,
    item: GridloremipsumdolRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewFilledSearchListener(): Unit {
    binding.searchViewFilledSearch.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SEARCH_RESULT_ALBUM_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SearchResultAlbumActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
