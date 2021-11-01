package com.mindorks.bootcamp.learndagger.di.modules;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.qualifiers.DatabaseInfo;
import com.mindorks.bootcamp.learndagger.di.qualifiers.NetworkInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/1/21
 *****/
@Module
public class ApplicationModule {

    private final MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    Context provideContext(){
        return application;
    }

    @DatabaseInfo
    @Provides
    String provideDatabaseName() {
        return "xyz";
    }

    @NetworkInfo
    @Provides
    String provideApiKey(){
        return "api";
    }

  /*  @Singleton
    @Provides
    NetworkService provideNetworkService() {
        return new NetworkService(application, "abc");
    }*/

   /* @Singleton
    @Provides
    DatabaseService provideDatabaseService()
    {
        return new DatabaseService(application, "database", 1);
    }*/
}
