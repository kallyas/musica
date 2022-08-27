package com.musica.app.modules.downloads.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class DownloadsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloads: String? = MyApp.getInstance().resources.getString(R.string.lbl_downloads)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSortby: String? = MyApp.getInstance().resources.getString(R.string.lbl_sort_by)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlyDownlo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recently_downlo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_shuffle)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_play)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLike: String? = MyApp.getInstance().resources.getString(R.string.lbl_like)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtoPlaylist: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_to_playlist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDontPlayThis: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_don_t_play_this)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemoveDownload: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_remove_download)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewArtist: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_artist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGotoAlbum: String? = MyApp.getInstance().resources.getString(R.string.lbl_go_to_album)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDropdown: String? = MyApp.getInstance().resources.getString(R.string.lbl_share)

)
