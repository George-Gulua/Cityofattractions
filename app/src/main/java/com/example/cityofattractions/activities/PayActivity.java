package com.example.cityofattractions.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cityofattractions.R;
import com.example.cityofattractions.mvvm.views.AppActivity;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }


    public void  backPay(View view) {
        startActivity(new Intent(this, DateActivity.class));
    }

    public void  goPay2(View view) {
        startActivity(new Intent(this, FinishActivity.class));
    }
}