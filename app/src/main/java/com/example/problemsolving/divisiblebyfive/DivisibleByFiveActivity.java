package com.example.problemsolving.divisiblebyfive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityDivisibleByFiveBinding;

public class DivisibleByFiveActivity extends AppCompatActivity implements DivisibilityView{

    private ActivityDivisibleByFiveBinding divisibleByFiveBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        divisibleByFiveBinding = ActivityDivisibleByFiveBinding.inflate(getLayoutInflater());
        setContentView(divisibleByFiveBinding.getRoot());
        handleDivisibleBtn();
    }

    @Override
    public void handleDivisibleBtn() {
        divisibleByFiveBinding.divisibleBtn.setOnClickListener(v -> {
            String input = divisibleByFiveBinding.divisibleTxt.getText().toString();
            boolean five = new DivisibleByFiveImpl().findDivisibleByFive(input);
            divisibleByFiveBinding.outputDivisibleTxt.setText("It is " + five);
        });
    }
}