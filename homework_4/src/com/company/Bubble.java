package com.company;

public class Bubble {
    public static int[] sortAndSwap(int[] mass) {
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[j] < mass[j+1]) {
                    int temp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = temp;


                }
            }
        }
        return mass;
    }
    public static  int[] swapPs(int[] mass) {
        int temp = mass [0];
        mass [0] = mass [mass.length - 1];
        mass [mass.length -1] = temp;
        return mass;
    }

}
