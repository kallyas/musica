package com.musica.app.modules.profilesettings.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileSettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAndrewAinsley: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_andrew_ainsley)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_andrew_ainsley)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnjoyAllBenef: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_all_benef)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnjoylistening: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enjoy_listening)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotification: String? = MyApp.getInstance().resources.getString(R.string.lbl_notification)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAudioVideo: String? = MyApp.getInstance().resources.getString(R.string.lbl_audio_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlayback: String? = MyApp.getInstance().resources.getString(R.string.lbl_playback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataSaverSt: String? = MyApp.getInstance().resources.getString(R.string.msg_data_saver_st)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecurity: String? = MyApp.getInstance().resources.getString(R.string.lbl_security)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_english_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDarkMode: String? = MyApp.getInstance().resources.getString(R.string.lbl_dark_mode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLibrary: String? = MyApp.getInstance().resources.getString(R.string.lbl_library)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
