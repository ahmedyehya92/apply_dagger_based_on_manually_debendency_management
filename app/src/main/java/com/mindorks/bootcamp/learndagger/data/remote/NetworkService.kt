package com.mindorks.bootcamp.learndagger.data.remote

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifiers.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifiers.NetworkInfo
import javax.inject.Inject
import javax.inject.Singleton

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
@Singleton
class NetworkService @Inject constructor(
    @ApplicationContext val context: Context,
    @NetworkInfo val apiKey: String,
)  {
    fun getDummyData (): String {
        return "DUMMY_DATA"
    }

}