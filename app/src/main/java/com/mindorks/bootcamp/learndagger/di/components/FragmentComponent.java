package com.mindorks.bootcamp.learndagger.di.components;

import com.mindorks.bootcamp.learndagger.di.modules.FragmentModule;
import com.mindorks.bootcamp.learndagger.di.scopes.ActivityScope;
import com.mindorks.bootcamp.learndagger.di.scopes.FragmentScope;
import com.mindorks.bootcamp.learndagger.ui.home.HomeFragment;

import dagger.Component;

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/2/21
 *****/
@FragmentScope
@Component(dependencies = {ApplicationComponent.class},modules = FragmentModule.class)
public interface FragmentComponent {
    void inject(HomeFragment homeFragment);
}
