package com.mindorks.bootcamp.learndagger.di.modules;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.mindorks.bootcamp.learndagger.di.scopes.ActivityScope;

import dagger.Module;
import dagger.Provides;

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/2/21
 *****/
@Module
public class FragmentModule {
    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @ActivityScope
    @Provides
    Context provideContext() {return fragment.getContext();}
}
