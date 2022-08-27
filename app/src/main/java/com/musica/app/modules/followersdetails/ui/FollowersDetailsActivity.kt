package com.musica.app.modules.followersdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityFollowersDetailsBinding
import com.musica.app.modules.followersdetails.`data`.model.Listprofilename1RowModel
import com.musica.app.modules.followersdetails.`data`.viewmodel.FollowersDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FollowersDetailsActivity :
    BaseActivity<ActivityFollowersDetailsBinding>(R.layout.activity_followers_details) {
  private val viewModel: FollowersDetailsVM by viewModels<FollowersDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listprofilenameAdapter =
    ListprofilenameAdapter(viewModel.listprofilenameList.value?:mutableListOf())
    binding.recyclerListprofilename.adapter = listprofilenameAdapter
    listprofilenameAdapter.setOnItemClickListener(
    object : ListprofilenameAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listprofilename1RowModel) {
        onClickRecyclerListprofilename(view, position, item)
      }
    }
    )
    viewModel.listprofilenameList.observe(this) {
      listprofilenameAdapter.updateData(it)
    }
    binding.followersDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListprofilename(
    view: View,
    position: Int,
    item: Listprofilename1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOLLOWERS_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FollowersDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
