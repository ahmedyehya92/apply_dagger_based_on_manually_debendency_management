package com.mindorks.bootcamp.learndagger.di.modules;


import android.app.Activity;
import android.content.Context;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.ui.MainViewModel;

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

    @Provides
    Context provideContext() {
        return activity;
    }
}
