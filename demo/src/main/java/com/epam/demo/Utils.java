package com.epam.demo;



import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       //magic happens here
        StringUtils obj = new StringUtils();
        for (String str : args) {
            if(!obj.isPositiveNumber(str))
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> list =  List.of("-11.22", "0", "33", "87");
        System.out.println(isAllPositiveNumbers(list));
    }
}