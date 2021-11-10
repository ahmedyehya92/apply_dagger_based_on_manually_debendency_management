package com.mindorks.bootcamp.learndagger.ui.home

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper
import javax.inject.Inject

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
class HomeViewModel @Inject constructor(val databaseService: DatabaseService, val networkService: NetworkService, val networkHelper: NetworkHelper){

}