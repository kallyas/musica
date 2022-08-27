package com.musica.app.modules.queue.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityQueueBinding
import com.musica.app.modules.queue.`data`.model.QueueRowModel
import com.musica.app.modules.queue.`data`.viewmodel.QueueVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class QueueActivity : BaseActivity<ActivityQueueBinding>(R.layout.activity_queue) {
  private val viewModel: QueueVM by viewModels<QueueVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val queueAdapter = QueueAdapter(viewModel.queueList.value?:mutableListOf())
    binding.recyclerQueue.adapter = queueAdapter
    queueAdapter.setOnItemClickListener(
    object : QueueAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : QueueRowModel) {
        onClickRecyclerQueue(view, position, item)
      }
    }
    )
    viewModel.queueList.observe(this) {
      queueAdapter.updateData(it)
    }
    binding.queueVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerQueue(
    view: View,
    position: Int,
    item: QueueRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "QUEUE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QueueActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
