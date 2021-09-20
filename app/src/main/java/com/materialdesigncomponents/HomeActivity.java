package com.materialdesigncomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import com.materialdesigncomponents.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity
{

    protected ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);



    }
}