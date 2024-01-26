package com.epam.demo;
import java.util.List;
import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
        for (String arg : args){
            if (StringUtils.isPositiveNumber(arg)){
                continue;
            }
            else {
                return  false;
            }
        }
        return true;
    }
}