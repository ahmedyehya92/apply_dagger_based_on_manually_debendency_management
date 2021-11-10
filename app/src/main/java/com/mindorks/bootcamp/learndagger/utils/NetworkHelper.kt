package com.mindorks.bootcamp.learndagger.utils

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
@Singleton
class NetworkHelper @Inject constructor(@ApplicationContext val context: Context){
    fun isNetworkConnected(): Boolean {
        return false
    }
}