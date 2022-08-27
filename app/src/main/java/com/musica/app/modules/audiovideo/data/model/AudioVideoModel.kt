package com.musica.app.modules.audiovideo.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class AudioVideoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAudioVideo: String? = MyApp.getInstance().resources.getString(R.string.lbl_audio_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAudioQuality: String? = MyApp.getInstance().resources.getString(R.string.lbl_audio_quality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWiFiStreaming: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_wi_fi_streaming)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHigh: String? = MyApp.getInstance().resources.getString(R.string.lbl_high)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataCellularS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_data_cellular_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAutomatic: String? = MyApp.getInstance().resources.getString(R.string.lbl_automatic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAutoAdjustQua: String? =
      MyApp.getInstance().resources.getString(R.string.msg_auto_adjust_qua)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownload: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNormal: String? = MyApp.getInstance().resources.getString(R.string.lbl_normal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloadOnlyU: String? =
      MyApp.getInstance().resources.getString(R.string.msg_download_only_u)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEqualizer: String? = MyApp.getInstance().resources.getString(R.string.lbl_equalizer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVideoQuality: String? = MyApp.getInstance().resources.getString(R.string.lbl_video_quality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWiFiStreamingOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_wi_fi_streaming)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHighOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_high)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataCellularSOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_data_cellular_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMedium: String? = MyApp.getInstance().resources.getString(R.string.lbl_medium)

)
