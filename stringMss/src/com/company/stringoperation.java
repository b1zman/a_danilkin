package com.company;

import java.util.Locale;

public class stringoperation {
    public static void main(String[] args) {
        String str = new String("Live without regrets");
        String[] stringar = str.split(" ");
        {
            if (stringar.length == 1) {
                System.out.println(str.toUpperCase() + " " + str.length());
            } else {
                for (String i : stringar) {
                    String longstr = stringar[stringar.length - 1];
                    if (i.length() >= longstr.length()) {
                        longstr = i;
                        System.out.println(longstr + " " + longstr.length());
                    }
                }
            }
        }
    }
}


// for (String elm : stringar) {
//  System.out.println(elm + " " + elm.length());







