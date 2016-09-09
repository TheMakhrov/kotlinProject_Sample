package com.example.anton.kotlinprojectground.dependencies.modules

import android.app.Application
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
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
  fun provideGson(): Gson {
    val gsonBuilder = GsonBuilder()
    gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
    return gsonBuilder.create()
  }

  @Provides
  @Singleton
  fun provideOkHttpClient(cache: Cache): OkHttpClient {
    val okHttpClientBuilder = OkHttpClient.Builder()
    okHttpClientBuilder.cache(cache)
    return okHttpClientBuilder.build()
  }
}

