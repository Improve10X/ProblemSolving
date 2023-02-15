package com.example.problemsolving.hoursminutestoseconds;

public class HoursAndMinutesImpl implements HoursController{
    @Override
    public int convert(String hours, String min) {
        try {
            int hour = (Integer.parseInt(hours));
            int minute = (Integer.parseInt(min));
            int second = 0;
            second = (hour * 60 + minute) * 60;
            return second;
        } catch (Exception ex) {
            return -1;
        }
    }
}
