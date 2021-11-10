package com.mindorks.bootcamp.learndagger.data.local

import android.content.Context
import com.mindorks.bootcamp.learndagger.di.qualifiers.ApplicationContext
import com.mindorks.bootcamp.learndagger.di.qualifiers.DatabaseInfo
import javax.inject.Inject
import javax.inject.Singleton

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/10/21
 *****/
@Singleton
class DatabaseService @Inject constructor(
    @ApplicationContext val context: Context,
    @DatabaseInfo val databaseName: String,
    @DatabaseInfo val dataBaseVersion: Int,
)
{
    fun getDummyData(): String
    {
        return "DATABASE_DUMMY_DATA"
    }
}