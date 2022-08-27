package com.musica.app.modules.artistsearchresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityArtistSearchResultBinding
import com.musica.app.modules.artistsearchresult.`data`.model.ListellipseoneRowModel
import com.musica.app.modules.artistsearchresult.`data`.viewmodel.ArtistSearchResultVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ArtistSearchResultActivity :
    BaseActivity<ActivityArtistSearchResultBinding>(R.layout.activity_artist_search_result) {
  private val viewModel: ArtistSearchResultVM by viewModels<ArtistSearchResultVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseoneAdapter =
    ListellipseoneAdapter(viewModel.listellipseoneList.value?:mutableListOf())
    binding.recyclerListellipseone.adapter = listellipseoneAdapter
    listellipseoneAdapter.setOnItemClickListener(
    object : ListellipseoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseoneRowModel) {
        onClickRecyclerListellipseone(view, position, item)
      }
    }
    )
    viewModel.listellipseoneList.observe(this) {
      listellipseoneAdapter.updateData(it)
    }
    binding.artistSearchResultVM = viewModel
    setUpSearchViewFilledSearchListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipseone(
    view: View,
    position: Int,
    item: ListellipseoneRowModel
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
      const val TAG: String = "ARTIST_SEARCH_RESULT_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ArtistSearchResultActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
