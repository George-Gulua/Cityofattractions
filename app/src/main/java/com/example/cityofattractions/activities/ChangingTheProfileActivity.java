package com.example.cityofattractions.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cityofattractions.R;
import com.example.cityofattractions.mvvm.views.AppActivity;

public class ChangingTheProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changing_the_profile);
    }
    public void  backChanging(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }

    public void  goChanging(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }
}