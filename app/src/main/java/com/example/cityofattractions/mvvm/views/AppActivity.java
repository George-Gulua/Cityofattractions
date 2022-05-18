package com.example.cityofattractions.mvvm.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.example.cityofattractions.R;
import com.example.cityofattractions.activities.ChangingTheProfileActivity;
import com.example.cityofattractions.activities.DateActivity;
import com.example.cityofattractions.activities.InfoAttrActivity;
import com.example.cityofattractions.activities.MyBuyActivity;
import com.example.cityofattractions.activities.PayActivity;
import com.example.cityofattractions.fragments.BasketFragment;
import com.example.cityofattractions.fragments.ChoiceFragment;
import com.example.cityofattractions.fragments.LikeFragment;
import com.example.cityofattractions.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AppActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ChoiceFragment choiceFragment = new ChoiceFragment();
    BasketFragment basketFragment = new BasketFragment();
    LikeFragment likeFragment = new LikeFragment();
    ProfileFragment profileFragment = new ProfileFragment();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_choice);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.body_container, new ChoiceFragment()).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.page_basket:
                    selectedFragment = basketFragment;
                    break;
                case R.id.page_choice:
                    selectedFragment = choiceFragment;
                    break;
                case R.id.page_like:
                    selectedFragment = likeFragment;
                    break;
                case R.id.page_profile:
                    selectedFragment = profileFragment;
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.body_container, selectedFragment).commit();
            return true;
        });
    }

    public void openDescription(View view) {
        startActivity(new Intent(this, InfoAttrActivity.class));
    }

    public void goPay(View view) {
        startActivity(new Intent(this, DateActivity.class));
    }

    public void goShop(View view) {
        startActivity(new Intent(this, MyBuyActivity.class));
    }

    public void goChangeButton(View view) {
        startActivity(new Intent(this, ChangingTheProfileActivity.class));
    }
}