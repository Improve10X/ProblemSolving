package com.example.problemsolving.threeprogrammers;

import android.util.Log;

public class ThreeProgrammersImpl implements ProgrammersController{

    @Override
    public int getMaxAndMin(String ps1, String ps2, String ps3) {
        try {
            int p1Salary = Integer.parseInt(ps1);
            int p2Salary = Integer.parseInt(ps2);
            int p3Salary = Integer.parseInt(ps3);
            int max = findMax(p1Salary, p2Salary, p3Salary);
            int min = findMin(p1Salary, p2Salary, p3Salary);
            return max - min;
        } catch (Exception ex) {
            Log.e("TAG", ex.getMessage(), ex);
            return -1;
        }
    }

    @Override
    public int findMax(int ps1, int ps2, int ps3) {
        if (ps1 > ps2 && ps1 > ps3) {
            return ps1;
        } else if (ps2 > ps3) {
            return ps2;
        } else {
            return ps3;
        }
    }

    @Override
    public int findMin(int ps1, int ps2, int ps3) {
        if (ps1 < ps2 && ps1 < ps3) {
            return ps1;
        } else if (ps2 < ps3) {
            return ps2;
        } else {
            return ps3;
        }
    }
}
