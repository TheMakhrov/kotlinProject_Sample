package com.example.anton.kotlinprojectground.dependencies.components

import com.example.anton.kotlinprojectground.MainActivity
import com.example.anton.kotlinprojectground.dependencies.modules.AppModule
import com.example.anton.kotlinprojectground.dependencies.modules.NetModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created on 9/9/16.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, NetModule::class))
interface NetComponent {
  fun inject(mainActivity: MainActivity)
}
