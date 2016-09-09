package com.example.anton.kotlinprojectground.dependencies.modules

import android.app.Application
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import javax.inject.Singleton

/**
 * Created on 9/9/16.
 */
@Module
class NetModule(val baseUrl: String) {
  @Provides
  @Singleton
  fun provideOkHttpCache(application: Application): Cache {
    val cacheSize: Long = 10 * 1024 * 1024
    val cache: Cache = Cache(application.cacheDir, cacheSize)
    return cache
  }

  @Provides
  @Singleton
  fun provideOkHttpClient(cache: Cache): OkHttpClient {
    val okHttpClientBuilder = OkHttpClient.Builder()
    okHttpClientBuilder.cache(cache)
    return okHttpClientBuilder.build()
  }
}

