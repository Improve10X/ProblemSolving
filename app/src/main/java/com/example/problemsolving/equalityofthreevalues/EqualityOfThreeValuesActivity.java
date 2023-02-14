package com.example.problemsolving.equalityofthreevalues;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityEqualityOfThreeValuesBinding;

public class EqualityOfThreeValuesActivity extends AppCompatActivity implements EqualityView {

    private ActivityEqualityOfThreeValuesBinding threeValuesBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        threeValuesBinding = ActivityEqualityOfThreeValuesBinding.inflate(getLayoutInflater());
        setContentView(threeValuesBinding.getRoot());
        getSupportActionBar().setTitle("Equality Of Three Values");
        handleEqualityBtn();
    }

    @Override
    public void handleEqualityBtn() {
        threeValuesBinding.equalityBtn.setOnClickListener(v -> {
            String inputOne = threeValuesBinding.inputATxt.getText().toString();
            String inputTwo = threeValuesBinding.inputbTxt.getText().toString();
            String inputThree = threeValuesBinding.inputcTxt.getText().toString();
            int output = new EqualityImpl().equality(inputOne, inputTwo, inputThree);
            threeValuesBinding.outputEqualityTxt.setText("The value is " + output);
        });
    }
}