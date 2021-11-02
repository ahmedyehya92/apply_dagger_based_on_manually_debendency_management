package com.mindorks.bootcamp.learndagger.ui.main;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.components.ActivityComponent;
import com.mindorks.bootcamp.learndagger.di.components.DaggerActivityComponent;
import com.mindorks.bootcamp.learndagger.di.modules.ActivityModule;
import com.mindorks.bootcamp.learndagger.ui.home.HomeFragment;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public MainViewModel viewModel;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDependencies();

        TextView tvData = findViewById(R.id.tvData);
        tvData.setText(viewModel.getSomeData());

        addHomeFragment();

    }

    private void addHomeFragment() {
        if(getSupportFragmentManager().findFragmentByTag(HomeFragment.TAG) == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container_fragment, HomeFragment.newInstance(), HomeFragment.TAG)
                    .commit();
        }
    }

    private void getDependencies() {
        DaggerActivityComponent.
                builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((MyApplication) getApplication()).applicationComponent)
                .build().inject(this);
    }
}
