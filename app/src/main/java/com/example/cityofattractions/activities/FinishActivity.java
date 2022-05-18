package com.example.cityofattractions.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cityofattractions.R;
import com.example.cityofattractions.mvvm.views.AppActivity;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
    }
    public void  goBackFinish(View view) {
        startActivity(new Intent(this, AppActivity.class));
    }
}