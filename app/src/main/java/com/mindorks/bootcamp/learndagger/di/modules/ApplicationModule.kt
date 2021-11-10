package com.mindorks.bootcamp.learndagger.di.modules

import android.app.Application
import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifiers.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifiers.DatabaseInfo
import com.mindorks.bootcamp.learndagger.di.qualifiers.NetworkInfo
import dagger.Module
import dagger.Provides

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
@Module
class ApplicationModule(
    var application: Application
) {
    @ApplicationContext
    @Provides
    fun provideContext(): Context = application

    @DatabaseInfo
    @Provides
    fun provideDatabaseName() = "xyz"

    @DatabaseInfo
    @Provides
    fun provideDatabaseVersion() = 1

    @NetworkInfo
    @Provides
    fun provideApiKey() = "apiKey"
}