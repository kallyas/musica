package com.musica.app.modules.charts.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class ChartsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCharts: String? = MyApp.getInstance().resources.getString(R.string.lbl_charts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeeklyAlbumCh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_weekly_album_ch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeeklySongCha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_weekly_song_cha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDailyViralCha: String? =
      MyApp.getInstance().resources.getString(R.string.msg_daily_viral_cha)

)
