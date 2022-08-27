package com.musica.app.modules.newplaylist.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.musica.app.databinding.BottomsheetNewPlaylistBinding
import com.musica.app.modules.newplaylist.`data`.viewmodel.NewPlaylistVM
import kotlin.String
import kotlin.Unit

class NewPlaylistBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetNewPlaylistBinding>(R.layout.bottomsheet_new_playlist)
    {
  private val viewModel: NewPlaylistVM by viewModels<NewPlaylistVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.newPlaylistVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCancel.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "NEW_PLAYLIST_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): NewPlaylistBottomsheet {
      val fragment = NewPlaylistBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}
