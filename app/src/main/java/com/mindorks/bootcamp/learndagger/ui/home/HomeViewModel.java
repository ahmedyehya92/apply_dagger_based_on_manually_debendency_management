package com.mindorks.bootcamp.learndagger.ui.home;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.utils.NetworkHelper;

import javax.inject.Inject;

/****
 * Author: Ahmed Yehya
 * Email: ahmedyehya1992@gmail.com
 * Created on: 11/2/21
 *****/
public class HomeViewModel {
    private NetworkService networkService;
    private NetworkHelper networkHelper;
    private DatabaseService databaseService;

    @Inject
    public HomeViewModel(NetworkService networkService, NetworkHelper networkHelper, DatabaseService databaseService) {
        this.networkService = networkService;
        this.networkHelper = networkHelper;
        this.databaseService = databaseService;
    }

    public String getSomeData() {
        return databaseService.getDummyData()
                + " : " + networkService.getDummyData()
                + " : " + networkHelper.isNetworkConnected();
    }
}
