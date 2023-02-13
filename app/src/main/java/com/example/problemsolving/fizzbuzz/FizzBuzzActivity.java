package com.example.problemsolving.fizzbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityFizzBuzzBinding;

public class FizzBuzzActivity extends AppCompatActivity implements FizzBuzzView {

    private ActivityFizzBuzzBinding fizzBuzzBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fizzBuzzBinding = ActivityFizzBuzzBinding.inflate(getLayoutInflater());
        setContentView(fizzBuzzBinding.getRoot());
        getSupportActionBar().setTitle("Fizz Buzz");
        handleFizzBtn();
    }

    @Override
    public void handleFizzBtn() {
        fizzBuzzBinding.fizzbuzzBtn.setOnClickListener(v -> {
            String input = fizzBuzzBinding.inputFizzTxt.getText().toString();
            String result = new FizzBuzzImpl().findFizzBuzz(input);
            fizzBuzzBinding.outputFizzTxt.setText("It is " + result);
        });
    }
}