package com.arpaul.libraryutilities;

import android.text.TextUtils;

import java.util.ArrayList;

/**
 * Created by Aritra on 4/26/2016.
 */
public class StringUtils {
    public static int getInt(String integer) {
        int reqInteger = 0;

        if(integer == null || TextUtils.isEmpty(integer))
            return reqInteger;

        reqInteger = Integer.parseInt(integer);

        return reqInteger;
    }

    public static long getLong(String integer) {
        long reqInteger = 0;

        if(integer == null || TextUtils.isEmpty(integer))
            return reqInteger;

        reqInteger = Long.parseLong(integer);

        return reqInteger;
    }

    public static String getStringFormattedArray(ArrayList<String> arrString) {
        String eventDate = "";

        if(arrString == null || arrString.size() <= 0)
            return eventDate;

        eventDate = TextUtils.join(",", arrString);

        return eventDate;
    }

    public static String removeLastComma(String inputString){
        String finalStr = "";

        if(!TextUtils.isEmpty(inputString)){
            inputString = inputString.toString().trim();
        }
        if(inputString.contains(","))
            finalStr = inputString.substring(0, inputString.lastIndexOf(","));
        else
        finalStr = inputString;

        return finalStr;
    }
}
