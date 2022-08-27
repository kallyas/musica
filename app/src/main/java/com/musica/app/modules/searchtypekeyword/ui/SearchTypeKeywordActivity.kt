package com.musica.app.modules.searchtypekeyword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySearchTypeKeywordBinding
import com.musica.app.modules.searchtypekeyword.`data`.viewmodel.SearchTypeKeywordVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SearchTypeKeywordActivity :
    BaseActivity<ActivitySearchTypeKeywordBinding>(R.layout.activity_search_type_keyword) {
  private val viewModel: SearchTypeKeywordVM by viewModels<SearchTypeKeywordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchTypeKeywordVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
      const val TAG: String = "SEARCH_TYPE_KEYWORD_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SearchTypeKeywordActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
