package com.example.problemsolving.minutestoseconds;

import android.nfc.Tag;
import android.util.Log;

public class MinutesImpl implements MinutesController{

    @Override
    public int convertMinToSec(String min) {
        try {
            int minutes = (Integer.parseInt(min));
            int seconds = 0;
            seconds = minutes * 60;
            return seconds;
        } catch (Exception ex) {
            return -1;
        }
    }
}
