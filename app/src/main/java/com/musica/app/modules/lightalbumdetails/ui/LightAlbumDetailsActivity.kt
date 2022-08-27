package com.musica.app.modules.lightalbumdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityLightAlbumDetailsBinding
import com.musica.app.modules.lightalbumdetails.`data`.model.Listsongtitle1RowModel
import com.musica.app.modules.lightalbumdetails.`data`.viewmodel.LightAlbumDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LightAlbumDetailsActivity :
    BaseActivity<ActivityLightAlbumDetailsBinding>(R.layout.activity_light_album_details) {
  private val viewModel: LightAlbumDetailsVM by viewModels<LightAlbumDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsongtitleAdapter =
    ListsongtitleAdapter(viewModel.listsongtitleList.value?:mutableListOf())
    binding.recyclerListsongtitle.adapter = listsongtitleAdapter
    listsongtitleAdapter.setOnItemClickListener(
    object : ListsongtitleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listsongtitle1RowModel) {
        onClickRecyclerListsongtitle(view, position, item)
      }
    }
    )
    viewModel.listsongtitleList.observe(this) {
      listsongtitleAdapter.updateData(it)
    }
    binding.lightAlbumDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListsongtitle(
    view: View,
    position: Int,
    item: Listsongtitle1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIGHT_ALBUM_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LightAlbumDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
