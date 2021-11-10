package com.mindorks.bootcamp.learndagger

import android.app.Application
import android.util.Log
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.components.ApplicationComponent
import com.mindorks.bootcamp.learndagger.di.components.DaggerApplicationComponent
import com.mindorks.bootcamp.learndagger.di.modules.ApplicationModule
import javax.inject.Inject

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
class MyApplication: Application() {
    @Inject lateinit var networkService: NetworkService
    @Inject lateinit var databaseService: DatabaseService

    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()

        applicationComponent.inject(this)

        Log.d("DEBUG", networkService.toString())

    }
}