package com.example.cityofattractions.mvvm.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


import com.example.cityofattractions.mvvm.models.News;
import com.example.cityofattractions.mvvm.repositories.NewsRepository;

import java.util.ArrayList;

public class NewsViewModel extends ViewModel {
    private MutableLiveData<ArrayList<News>> currentName;

    public MutableLiveData<ArrayList<News>> getCurrentName() {

        if (currentName == null) {
            currentName = new MutableLiveData<ArrayList<News>>();
        }
        currentName.setValue(new NewsRepository().getHolder());
        return currentName;
    }
}

