package com.musica.app.modules.lightletsyouin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.appcomponents.facebookauth.FacebookHelper
import com.musica.app.appcomponents.googleauth.GoogleHelper
import com.musica.app.databinding.ActivityLightLetsYouInBinding
import com.musica.app.modules.lightletsyouin.`data`.viewmodel.LightLetsYouInVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LightLetsYouInActivity :
    BaseActivity<ActivityLightLetsYouInBinding>(R.layout.activity_light_lets_you_in) {
  private val viewModel: LightLetsYouInVM by viewModels<LightLetsYouInVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.lightLetsYouInVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearAutoLayoutHor.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.linearAutoLayoutHor1.setOnClickListener {
          googleLogin.login()
        }
        binding.imageArrowleft.setOnClickListener {
          finish()
        }
      }

      companion object {
        const val TAG: String = "LIGHT_LETS_YOU_IN_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, LightLetsYouInActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
