package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите целочесленное значение a");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("Введите целочесленное значение p");
        int p = in.nextInt();
        System.out.println("Введите значение m1 с плавающей точкой (используйте запятую)");
        double m1 = in.nextDouble();
        System.out.println("Введите значение m2 с плавающей точкой (используйте запятую)");
        double m2 = in.nextDouble();
        double G;
        System.out.println("G=" + (4 * Math.pow(Math.PI, 2) * Math.pow(a, 3)) / (Math.pow(p, 2) * (m1 + m2)));
    }
}