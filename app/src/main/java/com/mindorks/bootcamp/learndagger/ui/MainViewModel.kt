package com.mindorks.bootcamp.learndagger.ui

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import javax.inject.Inject

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/2/21
 *****/
class MainViewModel @Inject constructor(val databaseService: DatabaseService, val networkService: NetworkService) {
    fun getSumdata(): String {
        return databaseService.dummyData
    }
}