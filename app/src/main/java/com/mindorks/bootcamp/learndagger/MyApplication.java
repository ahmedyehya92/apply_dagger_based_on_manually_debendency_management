package com.mindorks.bootcamp.learndagger;

import android.app.Application;
import android.util.Log;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.components.ApplicationComponent;
import com.mindorks.bootcamp.learndagger.di.components.DaggerApplicationComponent;
import com.mindorks.bootcamp.learndagger.di.modules.ApplicationModule;
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper;

import javax.inject.Inject;

public class MyApplication extends Application {

    @Inject
    public NetworkService networkService;
    @Inject
    public DatabaseService databaseService;

    @Inject
    public NetworkHelper networkHelper;

    public ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        applicationComponent.inject(this);

        Log.d("DEBUGMyApplication", networkHelper.isNetworkConnected().toString());
        networkHelper.isNetworkConnected();
    }
}