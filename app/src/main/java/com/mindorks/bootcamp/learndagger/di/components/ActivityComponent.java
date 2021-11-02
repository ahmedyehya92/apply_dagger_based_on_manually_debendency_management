package com.mindorks.bootcamp.learndagger.di.components;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.modules.ActivityModule;
import com.mindorks.bootcamp.learndagger.di.scopes.ActivityScope;
import com.mindorks.bootcamp.learndagger.ui.main.MainActivity;

import dagger.Component;

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/1/21
 *****/
@ActivityScope
@Component(dependencies = {ApplicationComponent.class}, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}
