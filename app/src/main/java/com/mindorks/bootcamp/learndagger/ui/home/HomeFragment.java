package com.mindorks.bootcamp.learndagger.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.R;
import com.mindorks.bootcamp.learndagger.di.components.DaggerFragmentComponent;
import com.mindorks.bootcamp.learndagger.di.modules.FragmentModule;
import com.mindorks.bootcamp.learndagger.ui.main.MainActivity;

import javax.inject.Inject;


public class HomeFragment extends Fragment {

    @Inject
    HomeViewModel homeViewModel;

    public static final String TAG = "HomeFragment";

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDependencies();
    }

    private void getDependencies() {
        DaggerFragmentComponent.
                builder()
                .fragmentModule(new FragmentModule(this))
                .applicationComponent(((MyApplication) getActivity().getApplication()).applicationComponent)
                .build().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvMessage = view.findViewById(R.id.tv_message);
        tvMessage.setText(homeViewModel.getSomeData());
        Log.d("DEPUG_HOME_FRAGMENT", homeViewModel.toString());
    }
}