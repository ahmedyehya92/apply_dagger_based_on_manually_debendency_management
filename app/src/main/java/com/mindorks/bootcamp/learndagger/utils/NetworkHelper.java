package com.mindorks.bootcamp.learndagger.utils;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.qualifiers.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/2/21
 *****/
@Singleton
public class NetworkHelper {
    public Context context;


    @Inject
    public NetworkHelper(@ApplicationContext Context context) {
        this.context = context;
    }

    public Boolean isNetworkConnected() {
        return false;
    }
}