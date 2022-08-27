package com.musica.app.modules.searchresulttop.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySearchResultTopBinding
import com.musica.app.modules.searchresulttop.`data`.model.ListsongtitleTwoRowModel
import com.musica.app.modules.searchresulttop.`data`.viewmodel.SearchResultTopVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchResultTopActivity :
    BaseActivity<ActivitySearchResultTopBinding>(R.layout.activity_search_result_top) {
  private val viewModel: SearchResultTopVM by viewModels<SearchResultTopVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsongtitleTwoAdapter =
    ListsongtitleTwoAdapter(viewModel.listsongtitleTwoList.value?:mutableListOf())
    binding.recyclerListsongtitleTwo.adapter = listsongtitleTwoAdapter
    listsongtitleTwoAdapter.setOnItemClickListener(
    object : ListsongtitleTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsongtitleTwoRowModel) {
        onClickRecyclerListsongtitleTwo(view, position, item)
      }
    }
    )
    viewModel.listsongtitleTwoList.observe(this) {
      listsongtitleTwoAdapter.updateData(it)
    }
    binding.searchResultTopVM = viewModel
    setUpSearchViewFilledSearchListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsongtitleTwo(
    view: View,
    position: Int,
    item: ListsongtitleTwoRowModel
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
      const val TAG: String = "SEARCH_RESULT_TOP_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SearchResultTopActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
