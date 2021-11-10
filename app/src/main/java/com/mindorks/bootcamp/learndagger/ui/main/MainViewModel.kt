package com.mindorks.bootcamp.learndagger.ui.main

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.di.scopes.ActivityScope
import javax.inject.Inject

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/2/21
 *****/
@ActivityScope
class MainViewModel @Inject constructor(val databaseService: DatabaseService, val networkService: NetworkService) {
    fun getSomeData(): String {
        return databaseService.getDummyData()
    }
}