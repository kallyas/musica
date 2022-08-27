package com.musica.app.modules.moreoptionsone.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class MoreOptionsOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTy: String? = MyApp.getInstance().resources.getString(R.string.lbl_top)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_profiles)
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
  var txtDownloadOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)
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
