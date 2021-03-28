package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number " );
        int num1 = in.nextInt();

        System.out.print("Enter second number " );
        int num2 = in.nextInt();

        System.out.println("Введите операцию 1- сложение  2-вычитание 3-умножение 4-деление");
        int operation = in.nextInt();
        int result = 0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 * num2;
                break;
            default:
                System.out.println("Неизвестная операция");
        }
        if (operation >= 1 && operation <= 4) {
            System.out.printf("Результат операции: %d", result);
        }
    }
}
