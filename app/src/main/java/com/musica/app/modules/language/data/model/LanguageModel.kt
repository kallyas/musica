package com.musica.app.modules.language.`data`.model

import com.musica.app.R
import com.musica.app.appcomponents.di.MyApp
import kotlin.String

data class LanguageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuggested: String? = MyApp.getInstance().resources.getString(R.string.lbl_suggested)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_english_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_english_uk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOthers: String? = MyApp.getInstance().resources.getString(R.string.lbl_others)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMandarin: String? = MyApp.getInstance().resources.getString(R.string.lbl_mandarin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_hindi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_spanish)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_french)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_arabic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBengali: String? = MyApp.getInstance().resources.getString(R.string.lbl_bengali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_russian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_indonesia)

)
