package com.musica.app.modules.lightalbumsmoreoption.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityLightAlbumsMoreOptionBinding
import com.musica.app.modules.lightalbumsmoreoption.`data`.model.ListloremipsumRowModel
import com.musica.app.modules.lightalbumsmoreoption.`data`.viewmodel.LightAlbumsMoreOptionVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LightAlbumsMoreOptionActivity :
    BaseActivity<ActivityLightAlbumsMoreOptionBinding>(R.layout.activity_light_albums_more_option) {
  private val viewModel: LightAlbumsMoreOptionVM by viewModels<LightAlbumsMoreOptionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listloremipsumAdapter =
    ListloremipsumAdapter(viewModel.listloremipsumList.value?:mutableListOf())
    binding.recyclerListloremipsum.adapter = listloremipsumAdapter
    listloremipsumAdapter.setOnItemClickListener(
    object : ListloremipsumAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListloremipsumRowModel) {
        onClickRecyclerListloremipsum(view, position, item)
      }
    }
    )
    viewModel.listloremipsumList.observe(this) {
      listloremipsumAdapter.updateData(it)
    }
    binding.lightAlbumsMoreOptionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListloremipsum(
    view: View,
    position: Int,
    item: ListloremipsumRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "LIGHT_ALBUMS_MORE_OPTION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LightAlbumsMoreOptionActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
