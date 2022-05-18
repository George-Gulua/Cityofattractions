package com.example.cityofattractions.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cityofattractions.R;
import com.example.cityofattractions.adapters.LikeAdapter;
import com.example.cityofattractions.mvvm.models.Like;
import com.example.cityofattractions.mvvm.viewModel.LikeViewModel;

import java.util.ArrayList;

public class LikeFragment extends Fragment {

    LikeAdapter adapter;
    LikeViewModel newsViewModel;
    RecyclerView rcv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_like, container, false);

        newsViewModel = new ViewModelProvider(this).get(LikeViewModel.class);
        final Observer<ArrayList<Like>> nameObserver = new Observer<ArrayList<Like>>() {
            @Override
            public void onChanged(@Nullable final ArrayList<Like> news) {
                adapter = new LikeAdapter(news,requireContext());
                rcv.setAdapter(adapter);
            }
        };
        rcv = view.findViewById(R.id.likeRecycler);

        newsViewModel.getCurrentName().observe(getViewLifecycleOwner(), nameObserver);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),1);
        rcv.setLayoutManager(gridLayoutManager);

        return view;
    }
}