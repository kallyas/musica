package com.musica.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.musica.app.R
import com.musica.app.appcomponents.base.BaseActivity
import com.musica.app.databinding.ActivityAppNavigationBinding
import com.musica.app.modules.addnewcard.ui.AddNewCardActivity
import com.musica.app.modules.albums.ui.AlbumsActivity
import com.musica.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.musica.app.modules.artistdetails.ui.ArtistDetailsActivity
import com.musica.app.modules.artists.ui.ArtistsActivity
import com.musica.app.modules.artistsearchresult.ui.ArtistSearchResultActivity
import com.musica.app.modules.audiovideo.ui.AudioVideoActivity
import com.musica.app.modules.charts.ui.ChartsActivity
import com.musica.app.modules.createnewpassword.ui.CreateNewPasswordActivity
import com.musica.app.modules.createnewpin.ui.CreateNewPinActivity
import com.musica.app.modules.datasaverstorage.ui.DataSaverStorageActivity
import com.musica.app.modules.downloaded.ui.DownloadedActivity
import com.musica.app.modules.downloads.ui.DownloadsActivity
import com.musica.app.modules.downloadsone.ui.DownloadsOneActivity
import com.musica.app.modules.editprofile.ui.EditProfileActivity
import com.musica.app.modules.explore.ui.ExploreActivity
import com.musica.app.modules.filledotp.ui.FilledOtpActivity
import com.musica.app.modules.followartists.ui.FollowArtistsActivity
import com.musica.app.modules.followersdetails.ui.FollowersDetailsActivity
import com.musica.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.musica.app.modules.historymusic.ui.HistoryMusicActivity
import com.musica.app.modules.historypodcast.ui.HistoryPodcastActivity
import com.musica.app.modules.language.ui.LanguageActivity
import com.musica.app.modules.lightalbumdetails.ui.LightAlbumDetailsActivity
import com.musica.app.modules.lightalbumsmoreoption.ui.LightAlbumsMoreOptionActivity
import com.musica.app.modules.lighthome.ui.LightHomeActivity
import com.musica.app.modules.lightletsyouin.ui.LightLetsYouInActivity
import com.musica.app.modules.lightwalkthrough.ui.LightWalkthroughActivity
import com.musica.app.modules.lyrics.ui.LyricsActivity
import com.musica.app.modules.moreoptions.ui.MoreOptionsActivity
import com.musica.app.modules.moreoptionsone.ui.MoreOptionsOneActivity
import com.musica.app.modules.mylibrary.ui.MyLibraryActivity
import com.musica.app.modules.newplaylist.ui.NewPlaylistBottomsheet
import com.musica.app.modules.newreleases.ui.NewReleasesActivity
import com.musica.app.modules.notificationsettings.ui.NotificationSettingsActivity
import com.musica.app.modules.paymentmethod.ui.PaymentMethodActivity
import com.musica.app.modules.playback.ui.PlaybackActivity
import com.musica.app.modules.playlistdetails.ui.PlaylistDetailsActivity
import com.musica.app.modules.playlistdetailsone.ui.PlaylistDetailsOneActivity
import com.musica.app.modules.playlists.ui.PlaylistsActivity
import com.musica.app.modules.podcastdetails.ui.PodcastDetailsActivity
import com.musica.app.modules.podcastepisodedetails.ui.PodcastEpisodeDetailsActivity
import com.musica.app.modules.podcasters.ui.PodcastersActivity
import com.musica.app.modules.podcasts.ui.PodcastsActivity
import com.musica.app.modules.podcastsnotifications.ui.PodcastsNotificationsActivity
import com.musica.app.modules.popularartists.ui.PopularArtistsActivity
import com.musica.app.modules.profile.ui.ProfileActivity
import com.musica.app.modules.profiledetails.ui.ProfileDetailsActivity
import com.musica.app.modules.profiledetailsone.ui.ProfileDetailsOneActivity
import com.musica.app.modules.profilesettings.ui.ProfileSettingsActivity
import com.musica.app.modules.profilesettingsone.ui.ProfileSettingsOneBottomsheet
import com.musica.app.modules.queue.ui.QueueActivity
import com.musica.app.modules.resetpaswordsuccessful.ui.ResetPaswordSuccessfulDialog
import com.musica.app.modules.searchnotfound.ui.SearchNotFoundActivity
import com.musica.app.modules.searchresiltprofile1.ui.SearchResiltProfile1Activity
import com.musica.app.modules.searchresultalbum.ui.SearchResultAlbumActivity
import com.musica.app.modules.searchresultssongs.ui.SearchResultsSongsActivity
import com.musica.app.modules.searchresulttop.ui.SearchResultTopActivity
import com.musica.app.modules.searchtypekeyword.ui.SearchTypeKeywordActivity
import com.musica.app.modules.security.ui.SecurityActivity
import com.musica.app.modules.selectpaymentmethod.ui.SelectPaymentMethodActivity
import com.musica.app.modules.setfingerprint.ui.SetFingerprintActivity
import com.musica.app.modules.signin.ui.SignInActivity
import com.musica.app.modules.signup.ui.SignUpActivity
import com.musica.app.modules.songdetails.ui.SongDetailsActivity
import com.musica.app.modules.songplay.ui.SongPlayActivity
import com.musica.app.modules.songplayoverscreen.ui.SongPlayOverScreenActivity
import com.musica.app.modules.songs.ui.SongsActivity
import com.musica.app.modules.songsnotifications.ui.SongsNotificationsActivity
import com.musica.app.modules.splash.ui.SplashActivity
import com.musica.app.modules.subscribe.ui.SubscribeActivity
import com.musica.app.modules.summary.ui.SummaryDialog
import com.musica.app.modules.summaryone.ui.SummaryOneActivity
import com.musica.app.modules.topalbumsglobal.ui.TopAlbumsGlobalActivity
import com.musica.app.modules.trendingnow.ui.TrendingNowActivity
import com.musica.app.modules.yourlikes.ui.YourLikesActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearFIlledOTP.setOnClickListener {
      val destIntent = FilledOtpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfileSettings.setOnClickListener {
      val destIntent = ProfileSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPlaylistDetails.setOnClickListener {
      val destIntent = PlaylistDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPlaylistDetailsOne.setOnClickListener {
      val destIntent = PlaylistDetailsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSubscribe.setOnClickListener {
      val destIntent = SubscribeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTopAlbumsGlobal.setOnClickListener {
      val destIntent = TopAlbumsGlobalActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTrendingNow.setOnClickListener {
      val destIntent = TrendingNowActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExplore.setOnClickListener {
      val destIntent = ExploreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSelectPaymentMethod.setOnClickListener {
      val destIntent = SelectPaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearQueue.setOnClickListener {
      val destIntent = QueueActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfileSettingsOne.setOnClickListener {
      val destFragment = ProfileSettingsOneBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, ProfileSettingsOneBottomsheet.TAG)
    }
    binding.linearHistoryMusic.setOnClickListener {
      val destIntent = HistoryMusicActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArtistSearchResult.setOnClickListener {
      val destIntent = ArtistSearchResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear3LightLetsYouIn.setOnClickListener {
      val destIntent = LightLetsYouInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearchResiltProfile.setOnClickListener {
      val destIntent = SearchResiltProfile1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMoreOptionsOne.setOnClickListener {
      val destIntent = MoreOptionsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearEditProfile.setOnClickListener {
      val destIntent = EditProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPodcastEpisodeDetails.setOnClickListener {
      val destIntent = PodcastEpisodeDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMyLibrary.setOnClickListener {
      val destIntent = MyLibraryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCreateNewPassword.setOnClickListener {
      val destIntent = CreateNewPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearchResultsSongs.setOnClickListener {
      val destIntent = SearchResultsSongsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplash.setOnClickListener {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSongsNotifications.setOnClickListener {
      val destIntent = SongsNotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAddNewCard.setOnClickListener {
      val destIntent = AddNewCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotificationSettings.setOnClickListener {
      val destIntent = NotificationSettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNewPlaylist.setOnClickListener {
      val destFragment = NewPlaylistBottomsheet.getInstance(null)
      destFragment.show(this.supportFragmentManager, NewPlaylistBottomsheet.TAG)
    }
    binding.linearPodcastsNotifications.setOnClickListener {
      val destIntent = PodcastsNotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearchResultTop.setOnClickListener {
      val destIntent = SearchResultTopActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMoreOptions.setOnClickListener {
      val destIntent = MoreOptionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArtistDetails.setOnClickListener {
      val destIntent = ArtistDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear20LightHome.setOnClickListener {
      val destIntent = LightHomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPlaylists.setOnClickListener {
      val destIntent = PlaylistsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPlayback.setOnClickListener {
      val destIntent = PlaybackActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSetFingerprint.setOnClickListener {
      val destIntent = SetFingerprintActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSummaryOne.setOnClickListener {
      val destIntent = SummaryOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear65LightAlbumsMoreOption.setOnClickListener {
      val destIntent = LightAlbumsMoreOptionActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPaymentMethod.setOnClickListener {
      val destIntent = PaymentMethodActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearchResultAlbum.setOnClickListener {
      val destIntent = SearchResultAlbumActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDownloads.setOnClickListener {
      val destIntent = DownloadsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCreateNewPIN.setOnClickListener {
      val destIntent = CreateNewPinActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDownloaded.setOnClickListener {
      val destIntent = DownloadedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFollowArtists.setOnClickListener {
      val destIntent = FollowArtistsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFollowersDetails.setOnClickListener {
      val destIntent = FollowersDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear43LightAlbumDetails.setOnClickListener {
      val destIntent = LightAlbumDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearchNotFound.setOnClickListener {
      val destIntent = SearchNotFoundActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAudioVideo.setOnClickListener {
      val destIntent = AudioVideoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSongPlayOverScreen.setOnClickListener {
      val destIntent = SongPlayOverScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPodcastDetails.setOnClickListener {
      val destIntent = PodcastDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfileDetails.setOnClickListener {
      val destIntent = ProfileDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCharts.setOnClickListener {
      val destIntent = ChartsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPodcasters.setOnClickListener {
      val destIntent = PodcastersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPodcasts.setOnClickListener {
      val destIntent = PodcastsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLyrics.setOnClickListener {
      val destIntent = LyricsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHIstoryPodcast.setOnClickListener {
      val destIntent = HistoryPodcastActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfile.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSongs.setOnClickListener {
      val destIntent = SongsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDataSaverStorage.setOnClickListener {
      val destIntent = DataSaverStorageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearResetPaswordSuccessful.setOnClickListener {
      val destFragment = ResetPaswordSuccessfulDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, ResetPaswordSuccessfulDialog.TAG)
    }
    binding.linearArtists.setOnClickListener {
      val destIntent = ArtistsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPopularArtists.setOnClickListener {
      val destIntent = PopularArtistsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearYourLikes.setOnClickListener {
      val destIntent = YourLikesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSongDetails.setOnClickListener {
      val destIntent = SongDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearchTypeKeyword.setOnClickListener {
      val destIntent = SearchTypeKeywordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSongPlay.setOnClickListener {
      val destIntent = SongPlayActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLanguage.setOnClickListener {
      val destIntent = LanguageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfileDetailsOne.setOnClickListener {
      val destIntent = ProfileDetailsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear2LightWalkthrough.setOnClickListener {
      val destIntent = LightWalkthroughActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNewReleases.setOnClickListener {
      val destIntent = NewReleasesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAlbums.setOnClickListener {
      val destIntent = AlbumsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignIn.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSecurity.setOnClickListener {
      val destIntent = SecurityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDownloadsOne.setOnClickListener {
      val destIntent = DownloadsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSummary.setOnClickListener {
      val destFragment = SummaryDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, SummaryDialog.TAG)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
