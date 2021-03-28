package com.company;

public class Array {

    public static double findAverage(int[] Aray) {

        double summ = 0;

        for (int i = 0; i < Aray.length; i++) {
            summ += Aray[i];
        }
        return summ / Aray.length;
    }
}
