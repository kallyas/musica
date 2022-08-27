package com.musica.app.modules.searchnotfound.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySearchNotFoundBinding
import com.musica.app.modules.searchnotfound.`data`.viewmodel.SearchNotFoundVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SearchNotFoundActivity :
    BaseActivity<ActivitySearchNotFoundBinding>(R.layout.activity_search_not_found) {
  private val viewModel: SearchNotFoundVM by viewModels<SearchNotFoundVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchNotFoundVM = viewModel
    setUpSearchViewFilledSearchListener()
  }

  override fun setUpClicks(): Unit {
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
      const val TAG: String = "SEARCH_NOT_FOUND_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SearchNotFoundActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
