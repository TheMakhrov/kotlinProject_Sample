package com.example.anton.kotlinprojectground.dependencies

import android.content.SharedPreferences

/**
 * Created on 9/9/16.
 */
class ApplicationPrefs {
  private val prefs: SharedPreferences? = null

  fun getInstance() = prefs
}
