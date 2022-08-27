package com.musica.app.modules.appnavigation.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloads: String? = MyApp.getInstance().resources.getString(R.string.lbl_downloads)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt65LightAlbumsMoreOption: String? =
      MyApp.getInstance().resources.getString(R.string.msg_65_light_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddNewCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_new_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloadsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_downloads_one)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchResultsSongs: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_results)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDataSaverStorage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_data_saver_st)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_song_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtistDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_artist_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLyrics: String? = MyApp.getInstance().resources.getString(R.string.lbl_lyrics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlayback: String? = MyApp.getInstance().resources.getString(R.string.lbl_playback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileSettings: String? =
      MyApp.getInstance().resources.getString(R.string.msg_profile_setti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyLibrary: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_library)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_profile_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowersDetails: String? =
      MyApp.getInstance().resources.getString(R.string.msg_followers_detai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongPlay: String? = MyApp.getInstance().resources.getString(R.string.lbl_song_play)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationSettings: String? =
      MyApp.getInstance().resources.getString(R.string.msg_notification_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbums: String? = MyApp.getInstance().resources.getString(R.string.lbl_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtQueue: String? = MyApp.getInstance().resources.getString(R.string.lbl_queue)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcastEpisodeDetails: String? =
      MyApp.getInstance().resources.getString(R.string.msg_podcast_episode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt43LightAlbumDetails: String? =
      MyApp.getInstance().resources.getString(R.string.msg_43_light_album)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcasters: String? = MyApp.getInstance().resources.getString(R.string.lbl_podcasters)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongs: String? = MyApp.getInstance().resources.getString(R.string.lbl_songs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewPlaylist: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_playlist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMoreOptions: String? = MyApp.getInstance().resources.getString(R.string.lbl_more_options)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecurity: String? = MyApp.getInstance().resources.getString(R.string.lbl_security)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAudioVideo: String? = MyApp.getInstance().resources.getString(R.string.lbl_audio_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaylistDetails: String? =
      MyApp.getInstance().resources.getString(R.string.msg_playlist_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHIstoryPodcast: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_history_podcast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaylistDetailsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_playlist_detail2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchResultAlbum: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_result_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectPaymentMethod: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileSettingsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_profile_setti2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaylists: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSummary: String? = MyApp.getInstance().resources.getString(R.string.lbl_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubscribe: String? = MyApp.getInstance().resources.getString(R.string.lbl_subscribe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcastDetails: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_podcast_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSummaryOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_summary_one)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtistSearchResult: String? =
      MyApp.getInstance().resources.getString(R.string.msg_artist_search_r)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileDetailsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_profile_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHistoryMusic: String? = MyApp.getInstance().resources.getString(R.string.lbl_history_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloaded: String? = MyApp.getInstance().resources.getString(R.string.lbl_downloaded)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtists: String? = MyApp.getInstance().resources.getString(R.string.lbl_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourLikes: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_likes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchResultTop: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_result_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt20LightHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_light_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNewPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewReleases: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_releases)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchNotFound: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_not_foun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFIlledOTP: String? = MyApp.getInstance().resources.getString(R.string.lbl_filled_otp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetFingerprint: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_set_fingerprint)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcasts: String? = MyApp.getInstance().resources.getString(R.string.lbl_podcasts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongPlayOverScreen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_song_play_over)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMoreOptionsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_more_options_on)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongsNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.msg_songs_notificat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFollowArtists: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_follow_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt2LightWalkthrough: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2_light_walkthr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplash: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNewPIN: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_new_pin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchTypeKeyword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_type_key)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopAlbumsGlobal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_top_albums_glob2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPopularArtists: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_popular_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrendingNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_trending_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResetPaswordSuccessful: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reset_pasword_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3LightLetsYouIn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_3_light_lets_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodcastsNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.msg_podcasts_notifi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCharts: String? = MyApp.getInstance().resources.getString(R.string.lbl_charts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchResiltProfile: String? =
      MyApp.getInstance().resources.getString(R.string.msg_search_resilt_p)

)
