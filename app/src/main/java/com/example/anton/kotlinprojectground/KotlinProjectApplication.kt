package com.example.anton.kotlinprojectground

import android.app.Application
import com.example.anton.kotlinprojectground.dependencies.components.DaggerNetComponent
import com.example.anton.kotlinprojectground.dependencies.components.NetComponent
import com.example.anton.kotlinprojectground.dependencies.modules.AppModule

/**
 * Created on 9/9/16.
 */
class KotlinProjectApplication : Application() {
  companion object {
    lateinit var netComponent: NetComponent
  }

  override fun onCreate() {
    super.onCreate()
    netComponent = DaggerNetComponent.builder().appModule(AppModule(this)).build()
  }
}
