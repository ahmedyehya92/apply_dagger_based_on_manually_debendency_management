package com.mindorks.bootcamp.learndagger.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.components.DaggerMainActivityComponent;
import com.mindorks.bootcamp.learndagger.di.modules.ActivityModule;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public MainViewModel viewModel;

    @Inject
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainActivityComponent.
                builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((MyApplication) getApplication()).applicationComponent)
                .build()
                .inject(this);


        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(viewModel.getSomeData());

        Log.d("DEBUG Context", context.toString());
    }
}
