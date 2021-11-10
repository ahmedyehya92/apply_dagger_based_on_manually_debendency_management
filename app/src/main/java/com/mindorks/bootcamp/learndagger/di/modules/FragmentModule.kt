package com.mindorks.bootcamp.learndagger.di.modules

import androidx.fragment.app.Fragment
import com.mindorks.bootcamp.learndagger.di.qualifiers.ActivityContext
import dagger.Module
import dagger.Provides

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
@Module
class FragmentModule (
    val fragment: Fragment
        ){
    @ActivityContext
    @Provides
    fun provideContext() = fragment.context
}