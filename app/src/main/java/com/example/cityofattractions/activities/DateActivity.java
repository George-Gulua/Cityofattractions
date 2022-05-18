package com.example.cityofattractions.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cityofattractions.R;
import com.example.cityofattractions.mvvm.views.AppActivity;

public class DateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
    }
    public void  backToBasket(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }

    public void  goReserve(View view) {
        startActivity(new Intent(this, PayActivity.class));
    }
}