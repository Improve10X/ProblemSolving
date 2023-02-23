package com.example.problemsolving.integerInBounds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityIntegerInBoundsBinding;

public class IntegerInBoundsActivity extends AppCompatActivity implements IntegerInBoundsView{
    private ActivityIntegerInBoundsBinding integerInBoundsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        integerInBoundsBinding = ActivityIntegerInBoundsBinding.inflate(getLayoutInflater());
        setContentView(integerInBoundsBinding.getRoot());
        getSupportActionBar().setTitle("Integer In Bounds");
        handleVerifyBtn();
    }


    @Override
    public void handleVerifyBtn() {
        String number = integerInBoundsBinding.nInputTxt.getText().toString();
        String lower = integerInBoundsBinding.lowerBondsInputTxt.getText().toString();
        String upper = integerInBoundsBinding.upperBondsTxt.getText().toString();
            boolean output = new IntegerInBoundsImpl().withInBounds(number, lower, upper);
            integerInBoundsBinding.outputIntegerTxt.setText("The result is " + output);
        }
}