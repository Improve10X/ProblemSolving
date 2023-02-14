package com.example.problemsolving.lessthanhundred;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityLessThanHundredBinding;

public class LessThanHundredActivity extends AppCompatActivity implements LessThanHundredView{

    private ActivityLessThanHundredBinding lessThanHundredBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lessThanHundredBinding = ActivityLessThanHundredBinding.inflate(getLayoutInflater());
        setContentView(lessThanHundredBinding.getRoot());
        getSupportActionBar().setTitle("Less Than Hundred");
        handleHundredBtn();
    }


    @Override
    public void handleHundredBtn() {
        lessThanHundredBinding.verificationBtn.setOnClickListener(v -> {
            String inputA = lessThanHundredBinding.inputOneTxt.getText().toString();
            String inputB = lessThanHundredBinding.inputTwoTxt.getText().toString();
            boolean output = new HundredImpl().lessThanHundred(inputA, inputB);
            lessThanHundredBinding.outputHundredTxt.setText("The result is " + output);
        });
    }
}