package com.epam.utils;
import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        return NumberUtils.toInt(str,0) < 0;


            int number = Integer.parseInt(str);
            if(number > 0){
                return true;
            }
            return  false;

    }
}
