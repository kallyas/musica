package com.musica.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityForgotPasswordBinding
import com.musica.app.modules.forgotpassword.`data`.model.ListmusicRowModel
import com.musica.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ForgotPasswordActivity :
    BaseActivity<ActivityForgotPasswordBinding>(R.layout.activity_forgot_password) {
  private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listmusicAdapter = ListmusicAdapter(viewModel.listmusicList.value?:mutableListOf())
    binding.recyclerListmusic.adapter = listmusicAdapter
    listmusicAdapter.setOnItemClickListener(
    object : ListmusicAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmusicRowModel) {
        onClickRecyclerListmusic(view, position, item)
      }
    }
    )
    viewModel.listmusicList.observe(this) {
      listmusicAdapter.updateData(it)
    }
    binding.forgotPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListmusic(
    view: View,
    position: Int,
    item: ListmusicRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
