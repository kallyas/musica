package com.musica.app.modules.songplayoverscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivitySongPlayOverScreenBinding
import com.musica.app.modules.songplayoverscreen.`data`.model.Listsongtitle4RowModel
import com.musica.app.modules.songplayoverscreen.`data`.viewmodel.SongPlayOverScreenVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SongPlayOverScreenActivity :
    BaseActivity<ActivitySongPlayOverScreenBinding>(R.layout.activity_song_play_over_screen) {
  private val viewModel: SongPlayOverScreenVM by viewModels<SongPlayOverScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsongtitleAdapter =
    ListsongtitleAdapter(viewModel.listsongtitleList.value?:mutableListOf())
    binding.recyclerListsongtitle.adapter = listsongtitleAdapter
    listsongtitleAdapter.setOnItemClickListener(
    object : ListsongtitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listsongtitle4RowModel) {
        onClickRecyclerListsongtitle(view, position, item)
      }
    }
    )
    viewModel.listsongtitleList.observe(this) {
      listsongtitleAdapter.updateData(it)
    }
    binding.songPlayOverScreenVM = viewModel
    setUpSearchViewFilledSearchListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsongtitle(
    view: View,
    position: Int,
    item: Listsongtitle4RowModel
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
      const val TAG: String = "SONG_PLAY_OVER_SCREEN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SongPlayOverScreenActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
