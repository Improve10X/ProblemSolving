package com.example.problemsolving.findbomb;

import java.util.Locale;

public class FindBombImpl implements FindBombController{
    @Override
    public String findBomb(String str) throws Exception {
            String result = "";
            String strInLowerCase = str.toLowerCase(Locale.ROOT);
            if (strInLowerCase.contains("bomb")) {
                result = "Duck!";
            } else {
                result = "Relax, there is no Bomb";
            }
            return result;
        }
}
