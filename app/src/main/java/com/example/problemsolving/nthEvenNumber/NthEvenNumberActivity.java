package com.example.problemsolving.nthEvenNumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityNthEvenNumberBinding;
import com.example.problemsolving.nthEvenNumber.EvenNumberImpl;
import com.example.problemsolving.nthEvenNumber.EvenNumberView;

public class NthEvenNumberActivity extends AppCompatActivity implements EvenNumberView {

    private ActivityNthEvenNumberBinding nthEvenNumberBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nthEvenNumberBinding = ActivityNthEvenNumberBinding.inflate(getLayoutInflater());
        setContentView(nthEvenNumberBinding.getRoot());
        getSupportActionBar().setTitle("Nth Even Number");
        handleEvenBtn();
    }

    @Override
    public void handleEvenBtn() {
        nthEvenNumberBinding.verifyBtn.setOnClickListener(v -> {
            String input = nthEvenNumberBinding.evenNumberTxt.getText().toString();
            int output = new EvenNumberImpl().findEven(input);
            nthEvenNumberBinding.outputEvenTxt.setText("The Even Number is " + output);
        });
    }
}