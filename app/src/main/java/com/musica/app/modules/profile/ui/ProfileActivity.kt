package com.musica.app.modules.profile.ui

import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityProfileBinding
import com.musica.app.extensions.PickerHandler
import com.musica.app.extensions.PickerHandler.OPEN_STORAGE_REQUEST_CODE
import com.musica.app.extensions.PickerHandler.REQUEST_PERMISSION
import com.musica.app.modules.profile.`data`.viewmodel.ProfileVM
import com.vmadalin.easypermissions.EasyPermissions
import com.vmadalin.easypermissions.EasyPermissions.PermissionCallbacks
import com.vmadalin.easypermissions.dialogs.SettingsDialog
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.IntArray
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile),
    PermissionCallbacks {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.imageFolder.setOnClickListener {
      if(!hasPermission(READ_EXTERNAL_STORAGE)) {
        	requestPermission(READ_EXTERNAL_STORAGE)
      } else {
        	val pickFile = PickerHandler.filePickerIntent()
        	startActivityForResult(pickFile,OPEN_STORAGE_REQUEST_CODE)
      }
    }
  }

  override fun onRequestPermissionsResult(
    requestCode: Int,
    permissions: Array<String>,
    grantResults: IntArray
  ) {
    super.onRequestPermissionsResult(requestCode,permissions,grantResults)
    when(requestCode) {
      REQUEST_PERMISSION -> {
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults,
            this@ProfileActivity)
      }
    }
  }

  private fun hasPermission(permission: String): Boolean {
    val checkPermission = EasyPermissions.hasPermissions(this@ProfileActivity, permission)
    return checkPermission
  }

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    super.onActivityResult(requestCode,resultCode,data)
    when(requestCode) { 
    OPEN_STORAGE_REQUEST_CODE ->{
     if(resultCode == Activity.RESULT_OK){ 
    	 val filePath: Uri = data?.data!! 
     } 
    }
    }
  }

  private fun requestPermission(permission: String) {
    EasyPermissions.requestPermissions(this@ProfileActivity,
                    "This Application need Permission",
                    REQUEST_PERMISSION,
                    permission)
  }

  override fun onPermissionsDenied(requestCode: Int, perms: List<String>) {
    if(EasyPermissions.somePermissionPermanentlyDenied(this@ProfileActivity,*perms.toTypedArray())) {
      	 	 SettingsDialog.Builder(this@ProfileActivity).build().show()
      	}
    }

    override fun onPermissionsGranted(requestCode: Int, perms: List<String>) {
      Toast.makeText(this@ProfileActivity,R.string.msg_permission_granted,Toast.LENGTH_LONG).show()
    }

    companion object {
      const val TAG: String = "PROFILE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ProfileActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
