package com.mindorks.bootcamp.learndagger.di.components

import android.app.Application
import android.content.Context
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.modules.ApplicationModule
import com.mindorks.bootcamp.learndagger.di.qualifiers.ApplicationContext
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper
import dagger.Component
import javax.inject.Singleton

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(myApplication: Application)

    @ApplicationContext
    fun getContext(): Context

    fun getNetworkService(): NetworkService
    fun getDataBaseService(): DatabaseService
    fun getNetworkHelper(): NetworkHelper


}