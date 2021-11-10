package com.mindorks.bootcamp.learndagger.di.components

import com.mindorks.bootcamp.learndagger.di.modules.FragmentModule
import com.mindorks.bootcamp.learndagger.di.qualifiers.FragmentScope
import com.mindorks.bootcamp.learndagger.ui.home.HomeFragment
import dagger.Component

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
@FragmentScope
@Component(modules =[FragmentModule::class],dependencies = [ApplicationComponent::class])
interface FragmentComponent {
    fun inject(homeFragment: HomeFragment)
}