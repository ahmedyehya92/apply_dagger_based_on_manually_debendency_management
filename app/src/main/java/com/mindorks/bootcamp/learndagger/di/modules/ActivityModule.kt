package com.mindorks.bootcamp.learndagger.di.modules

import android.app.Activity
import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifiers.ActivityContext
import dagger.Module
import dagger.Provides

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
@Module
class ActivityModule (
    val activity: Activity
        )
{
    @ActivityContext
    @Provides
    fun provideContext(): Context = activity
}