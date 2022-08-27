package com.musica.app.modules.datasaverstorage.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class DataSaverStorageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDataSaverSt: String? = MyApp.getInstance().resources.getString(R.string.msg_data_saver_st)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataSaver: String? = MyApp.getInstance().resources.getString(R.string.lbl_data_saver)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAudioQuality: String? = MyApp.getInstance().resources.getString(R.string.lbl_audio_quality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetsyouraudio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sets_your_audio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcasts: String? = MyApp.getInstance().resources.getString(R.string.lbl_podcasts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloadAudio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_download_audio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSavevideopodc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_save_video_podc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreamAudioOn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_stream_audio_on)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlayvideopodc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_play_video_podc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStorage: String? = MyApp.getInstance().resources.getString(R.string.lbl_storage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOtherApps: String? = MyApp.getInstance().resources.getString(R.string.lbl_other_apps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesize: String? = MyApp.getInstance().resources.getString(R.string.lbl_75_4_gb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCache: String? = MyApp.getInstance().resources.getString(R.string.lbl_cache)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesizeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_120_6_mb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeSpace: String? = MyApp.getInstance().resources.getString(R.string.lbl_free_space)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilesizeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_50_5_gb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemoveAllDown: String? =
      MyApp.getInstance().resources.getString(R.string.msg_remove_all_down)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemovealloft: String? =
      MyApp.getInstance().resources.getString(R.string.msg_remove_all_of_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClearCache: String? = MyApp.getInstance().resources.getString(R.string.lbl_clear_cache)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFreeupstorage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_free_up_storage)

)
