package com.example.problemsolving.minutestoseconds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityMinutesToSecondsBinding;

public class MinutesToSeconds extends AppCompatActivity implements MinutesView {

    private ActivityMinutesToSecondsBinding activityMinutesToSecondsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMinutesToSecondsBinding = ActivityMinutesToSecondsBinding.inflate(getLayoutInflater());
        setContentView(activityMinutesToSecondsBinding.getRoot());
        getSupportActionBar().setTitle("Minutes To Seconds");
        handleConvertBtn();
    }

    @Override
    public void handleConvertBtn() {
        activityMinutesToSecondsBinding.convertMinSecBtn.setOnClickListener(v -> {
            String minutes = activityMinutesToSecondsBinding.minutesTxt.getText().toString();
            int convert = new MinutesImpl().convertMinToSec(minutes);
            activityMinutesToSecondsBinding.secondsTxt.setText("The Value is " + convert);
        });
    }
}