package com.musica.app.modules.searchresultssongs.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySearchResultsSongsBinding
import com.musica.app.modules.searchresultssongs.`data`.model.ListsongtitleRowModel
import com.musica.app.modules.searchresultssongs.`data`.viewmodel.SearchResultsSongsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchResultsSongsActivity :
    BaseActivity<ActivitySearchResultsSongsBinding>(R.layout.activity_search_results_songs) {
  private val viewModel: SearchResultsSongsVM by viewModels<SearchResultsSongsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsongtitleAdapter =
    ListsongtitleAdapter(viewModel.listsongtitleList.value?:mutableListOf())
    binding.recyclerListsongtitle.adapter = listsongtitleAdapter
    listsongtitleAdapter.setOnItemClickListener(
    object : ListsongtitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsongtitleRowModel) {
        onClickRecyclerListsongtitle(view, position, item)
      }
    }
    )
    viewModel.listsongtitleList.observe(this) {
      listsongtitleAdapter.updateData(it)
    }
    binding.searchResultsSongsVM = viewModel
    setUpSearchViewFilledSearchListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsongtitle(
    view: View,
    position: Int,
    item: ListsongtitleRowModel
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
      const val TAG: String = "SEARCH_RESULTS_SONGS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SearchResultsSongsActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
