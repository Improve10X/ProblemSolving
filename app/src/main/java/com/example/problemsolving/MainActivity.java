package com.example.problemsolving;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        getSupportActionBar().setTitle("Problem Solving");
        handleBtn();
    }

    private void handleBtn() {
        handleProgrammersBtn();
    }

    private void handleProgrammersBtn() {
        activityMainBinding.threeProgramBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThreeProgrammersProblemActivity.class);
            startActivity(intent);
        });
    }
}