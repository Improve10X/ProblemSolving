package com.example.problemsolving.hoursminutestoseconds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.problemsolving.databinding.ActivityHoursAndMinToSecBinding;

public class HoursAndMinToSecActivity extends AppCompatActivity implements HoursView{

    private ActivityHoursAndMinToSecBinding hoursAndMinToSecBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hoursAndMinToSecBinding = ActivityHoursAndMinToSecBinding.inflate(getLayoutInflater());
        setContentView(hoursAndMinToSecBinding.getRoot());
        getSupportActionBar().setTitle("Hours And Min to Sec");
        handleConvertBtn();
    }

    @Override
    public void handleConvertBtn() {
        hoursAndMinToSecBinding.convertHourBtn.setOnClickListener(v -> {
            String hour = hoursAndMinToSecBinding.hoursTxt.getText().toString();
            String minute = hoursAndMinToSecBinding.minutesEditTxt.getText().toString();
            int second = new HoursAndMinutesImpl().convert(hour, minute);
            hoursAndMinToSecBinding.secondsEditTxt.setText("The second is " + second);
        });
    }
}