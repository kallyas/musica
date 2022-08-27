package com.musica.app.modules.searchresiltprofile1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.google.android.material.tabs.TabLayoutMediator
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySearchResiltProfile1Binding
import com.musica.app.modules.searchresiltprofile1.`data`.viewmodel.SearchResiltProfile1VM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SearchResiltProfile1Activity :
    BaseActivity<ActivitySearchResiltProfile1Binding>(R.layout.activity_search_resilt_profile1) {
  private val viewModel: SearchResiltProfile1VM by viewModels<SearchResiltProfile1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchResiltProfile1VM = viewModel
    val adapter = SearchResiltProfile1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutFrame5,binding.viewPagerTabbarview) { tab, position ->
      tab.text = SearchResiltProfile1ActivityPagerAdapter.title[position]
      }.attach()
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
        const val TAG: String = "SEARCH_RESILT_PROFILE1ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, SearchResiltProfile1Activity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
