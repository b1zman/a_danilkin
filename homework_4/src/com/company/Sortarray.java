package com.company;

public class Sortarray {
    public static void main(String[] args) {
        int[] testMass = Bubble.sortAndSwap(new int[] {1,23,42,6,8,3});

        for (int j = 0; j < testMass.length; j++) {
            System.out.print(testMass[j] + " ");
        }
    }
}