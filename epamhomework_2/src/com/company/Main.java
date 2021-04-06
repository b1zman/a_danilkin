package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сделайте выбор типа алгоритма где: 1 - вычисление ряда чисел Фибоначчи, 2 -вычисление факториала");
        byte chose1 = in.nextByte();
        if (chose1 > 2) {
            System.out.println("Вы сделали не правильный выбор");
            {
                return;
            }
        }
        System.out.println("Сделайте выбор типа цикла где: 1 - цикл while, 2 - цикл do-while, 3 - цикл for");
        byte chose2 = in.nextByte();
        if (chose2 > 3) {
            System.out.println("Вы сделали не правильный выбор");
            {
                return;
            }
        }
        System.out.println("Введите параметр n передаваемый в алгоритм");
        int n = in.nextInt();
        if (chose1 == 1) {
            int j = 0;
            int f1 = 0;
            int f2 = 1;
            if (chose2 == 1) {
                while (j < n) {
                    int f3 = f1 + f2;
                    System.out.print(f1 + " ");
                    f1 = f2;
                    f2 = f3;
                    j++;
                }
            } else if (chose2 == 2) {
                do {
                    int f3 = f1 + f2;
                    System.out.print(f1 + " ");
                    f1 = f2;
                    f2 = f3;
                    j++;
                }
                while (j < n);
            } else {
                for (j = 0; j < n; j++) {
                    int f3 = f1 + f2;
                    System.out.print(f1 + " ");
                    f1 = f2;
                    f2 = f3;
                }
            }
        } else {
            int fc = 1;
            int j = 1;
            if (chose2 == 1) {
                while (j <= n) {
                    fc = fc * j;
                    j++;
                }
                {
                    System.out.print(fc + " ");
                }
            } else if (chose2 == 2) {
                do {
                    fc = fc * j;
                    j++;
                }
                while (j <= n);
                System.out.print(fc + " ");
            } else {
                for (j = 1; j <= n; j++) {
                    fc = fc * j;
                }
                {
                    System.out.print(fc);
                }
            }
        }
    }
}


