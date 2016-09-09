package com.example.anton.kotlinprojectground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import okhttp3.OkHttpClient
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
  @Inject
  lateinit var okHttpClient: OkHttpClient

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    KotlinProjectApplication.netComponent.inject(this)
  }
}
