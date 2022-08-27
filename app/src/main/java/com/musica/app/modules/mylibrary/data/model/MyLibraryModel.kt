package com.musica.app.modules.mylibrary.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class MyLibraryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyLibrary: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_library)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourHistory: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_history)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_the_jordan_harb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppleTalk: String? = MyApp.getInstance().resources.getString(R.string.lbl_apple_talk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDrDeath: String? = MyApp.getInstance().resources.getString(R.string.lbl_dr_death)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaylists: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloads: String? = MyApp.getInstance().resources.getString(R.string.lbl_downloads)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcasts: String? = MyApp.getInstance().resources.getString(R.string.lbl_podcasts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbums: String? = MyApp.getInstance().resources.getString(R.string.lbl_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongs: String? = MyApp.getInstance().resources.getString(R.string.lbl_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtists: String? = MyApp.getInstance().resources.getString(R.string.lbl_artists)
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
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
