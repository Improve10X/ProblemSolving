package com.example.problemsolving.twomakesten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityTwoMakesTenBinding;

public class TwoMakesTenActivity extends AppCompatActivity implements TwoMakesTenView {

    private ActivityTwoMakesTenBinding twoMakesTenBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        twoMakesTenBinding = ActivityTwoMakesTenBinding.inflate(getLayoutInflater());
        setContentView(twoMakesTenBinding.getRoot());
        getSupportActionBar().setTitle("Two Makes Ten");
        handleFindTen();
    }

    @Override
    public void handleFindTen() {
        twoMakesTenBinding.twoMakesTenBtn.setOnClickListener(v -> {
            String inputA = twoMakesTenBinding.inputOneTenTxt.getText().toString();
            String inputB = twoMakesTenBinding.inputTwoTenTxt.getText().toString();
            boolean result = new TwoMakesTenImpl().findTen(inputA, inputB);
            twoMakesTenBinding.outputTwoTenTxt.setText("The result is " + result);
        });
    }
}