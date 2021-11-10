package com.mindorks.bootcamp.learndagger.di.components

import com.mindorks.bootcamp.learndagger.di.modules.ActivityModule
import com.mindorks.bootcamp.learndagger.di.scopes.ActivityScope
import com.mindorks.bootcamp.learndagger.ui.main.MainActivity
import dagger.Component

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
@ActivityScope
@Component (dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}