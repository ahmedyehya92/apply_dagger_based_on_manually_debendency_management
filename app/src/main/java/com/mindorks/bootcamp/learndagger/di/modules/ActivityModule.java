package com.mindorks.bootcamp.learndagger.di.modules;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.qualifiers.ActivityContext;
import com.mindorks.bootcamp.learndagger.ui.home.HomeFragment;

import dagger.Module;
import dagger.Provides;

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/1/21
 *****/
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @ActivityContext
    @Provides
    Context provideContext() {
        return activity;
    }
}
