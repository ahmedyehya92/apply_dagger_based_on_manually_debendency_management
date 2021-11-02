package com.mindorks.bootcamp.learndagger.ui

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.components.DaggerActivityComponent
import com.mindorks.bootcamp.learndagger.di.modules.ActivityModule
import javax.inject.Inject

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/2/21
 *****/
class MainActivity: AppCompatActivity (){
    @Inject
    lateinit var context: Context

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        getDependencies()
        val tvData = findViewById<TextView>(R.id.tvData)
        tvData.setText(viewModel.getSomeData())

        Log.d("DEBUG Context", context.toString())

    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .activityModule(ActivityModule(this))
            .applicationComponent((application as MyApplication).applicationComponent)
            .build()
            .inject(this)

    }
}