package com.musica.app.modules.notificationsettings.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationSettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotificationSe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_notification_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommendedMus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_mus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_push_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewMusic: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPush: String? = MyApp.getInstance().resources.getString(R.string.lbl_push)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaylistUpdate: String? =
      MyApp.getInstance().resources.getString(R.string.msg_playlist_update)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushEmailOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_push_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConcertNotific: String? =
      MyApp.getInstance().resources.getString(R.string.msg_concert_notific)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushEmailTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_push_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtistUpdates: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_artist_updates)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushEmailThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_push_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductNews: String? = MyApp.getInstance().resources.getString(R.string.lbl_product_news)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHearmeOffers: String? = MyApp.getInstance().resources.getString(R.string.lbl_hearme_offers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushEmailFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_push_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewEpisodes: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_episodes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushEmailFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_push_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentsSubs: String? = MyApp.getInstance().resources.getString(R.string.msg_payments_subs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushEmailSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_push_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewFeatures: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_features)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_push)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecurity: String? = MyApp.getInstance().resources.getString(R.string.lbl_security)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPushEmailSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_push_email)

)
