package com.example.anton.kotlinprojectground.dependencies.modules

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created on 9/9/16.
 */
@Module
class AppModule(val application: Application) {
  @Provides
  @Singleton
  fun providesApplication() = application
}
