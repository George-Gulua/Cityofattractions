package com.example.cityofattractions.mvvm.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.cityofattractions.mvvm.models.Like;
import com.example.cityofattractions.mvvm.repositories.LikeRepository;

import java.util.ArrayList;

public class LikeViewModel extends ViewModel {
    private MutableLiveData<ArrayList<Like>> currentName;

    public MutableLiveData<ArrayList<Like>> getCurrentName() {

        if (currentName == null) {
            currentName = new MutableLiveData<ArrayList<Like>>();
        }
        currentName.setValue(new LikeRepository().getHolder());
        return currentName;
    }
}

