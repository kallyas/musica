package com.musica.app.modules.yourlikes.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityYourLikesBinding
import com.musica.app.modules.yourlikes.`data`.model.YourLikesRowModel
import com.musica.app.modules.yourlikes.`data`.viewmodel.YourLikesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class YourLikesActivity : BaseActivity<ActivityYourLikesBinding>(R.layout.activity_your_likes) {
  private val viewModel: YourLikesVM by viewModels<YourLikesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val yourLikesAdapter = YourLikesAdapter(viewModel.yourLikesList.value?:mutableListOf())
    binding.recyclerYourLikes.adapter = yourLikesAdapter
    yourLikesAdapter.setOnItemClickListener(
    object : YourLikesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : YourLikesRowModel) {
        onClickRecyclerYourLikes(view, position, item)
      }
    }
    )
    viewModel.yourLikesList.observe(this) {
      yourLikesAdapter.updateData(it)
    }
    binding.yourLikesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerYourLikes(
    view: View,
    position: Int,
    item: YourLikesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "YOUR_LIKES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, YourLikesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
