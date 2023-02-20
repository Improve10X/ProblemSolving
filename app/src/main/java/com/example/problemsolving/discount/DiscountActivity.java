package com.example.problemsolving.discount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityDiscountBinding;

public class DiscountActivity extends AppCompatActivity implements DiscountView{
    private ActivityDiscountBinding discountBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        discountBinding = ActivityDiscountBinding.inflate(getLayoutInflater());
        setContentView(discountBinding.getRoot());
        handleDiscountBtn();
    }

    @Override
    public void handleDiscountBtn() {
        discountBinding.discountBtn.setOnClickListener(v -> {
            String input1 = discountBinding.discountInputTxt.getText().toString();
            String input2 = discountBinding.discountInputTwoTxt.getText().toString();
            try {
                double output = new DiscountImpl().findDiscount(input1, input2);
                discountBinding.discountOutputTxt.setText("The price is " + output);
            } catch (Exception e) {
                e.printStackTrace();
                discountBinding.discountOutputTxt.setText("Invalid Input");
            }
        });
    }
}