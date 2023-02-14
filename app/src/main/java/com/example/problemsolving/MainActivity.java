package com.example.problemsolving;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityMainBinding;
import com.example.problemsolving.divisiblebyfive.DivisibleByFiveActivity;
import com.example.problemsolving.equalityofthreevalues.EqualityOfThreeValuesActivity;
import com.example.problemsolving.fizzbuzz.FizzBuzzActivity;
import com.example.problemsolving.hoursminutestoseconds.HoursAndMinToSecActivity;
import com.example.problemsolving.minutestoseconds.MinutesToSeconds;
import com.example.problemsolving.nthEvenNumber.NthEvenNumberActivity;
import com.example.problemsolving.threeprogrammers.ThreeProgrammersProblemActivity;
import com.example.problemsolving.twomakesten.TwoMakesTenActivity;

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
        handleMinutesBtn();
        handleHoursBtn();
        handleFizzBuzzBtn();
        handleDivisibleBtn();
        handleTwoMakesTen();
        handleEqualityBtn();
        handleEvenBtn();
    }

    private void handleProgrammersBtn() {
        activityMainBinding.threeProgramBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ThreeProgrammersProblemActivity.class);
            startActivity(intent);
        });
    }

    private void handleMinutesBtn() {
        activityMainBinding.convertMinBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MinutesToSeconds.class);
            startActivity(intent);
        });
    }

    private void handleHoursBtn() {
        activityMainBinding.hoursMinToSecBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, HoursAndMinToSecActivity.class);
            startActivity(intent);
        });
    }

    private void handleFizzBuzzBtn() {
        activityMainBinding.fizzBuzzBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FizzBuzzActivity.class);
            startActivity(intent);
        });
    }

    private void handleDivisibleBtn() {
        activityMainBinding.divisibleByFiveBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, DivisibleByFiveActivity.class);
            startActivity(intent);
        });
    }

    private void handleTwoMakesTen() {
        activityMainBinding.twoMakesTenTxt.setOnClickListener(v -> {
            Intent intent = new Intent(this, TwoMakesTenActivity.class);
            startActivity(intent);
        });
    }

    private void handleEqualityBtn() {
        activityMainBinding.equalityThreeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, EqualityOfThreeValuesActivity.class);
            startActivity(intent);
        });
    }

    private void handleEvenBtn() {
        activityMainBinding.evenBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, NthEvenNumberActivity.class);
            startActivity(intent);
        });
    }
}