package com.mindorks.bootcamp.learndagger.ui.main

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.components.DaggerActivityComponent
import com.mindorks.bootcamp.learndagger.di.modules.ActivityModule
import com.mindorks.bootcamp.learndagger.ui.home.HomeFragment
import com.mindorks.bootcamp.learndagger.ui.home.HomeFragment.Companion.newInstance
import javax.inject.Inject

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/2/21
 *****/
class MainActivity: AppCompatActivity (){


    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        getDependencies()
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        val tvData = findViewById<TextView>(R.id.tvData)
        tvData.setText(mainViewModel.getSomeData())
        addHomeFragment()

    }

    private fun getDependencies() {
        DaggerActivityComponent
            .builder()
            .activityModule(ActivityModule(this))
            .applicationComponent((application as MyApplication).applicationComponent)
            .build()
            .inject(this)

    }

    private fun addHomeFragment() {
        if (supportFragmentManager.findFragmentByTag(HomeFragment.TAG) == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_fragment, newInstance(), HomeFragment.TAG)
                .commit()
        }
    }
}