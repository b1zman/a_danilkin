package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class StrSort {
    public static void main(String[] args) {
        System.out.println("How much Str?");
        Scanner sc = new Scanner(System.in);
        int Str = sc.nextInt();
        String[] strArray = new String[Str];
        System.out.print("Input String for sort \t");
        {
            for (int i = 0; i < strArray.length; i++) ;

            {
                for (int j = 0; j < Str; j++)
                    strArray[j] = sc.next();
                System.out.print(Arrays.toString(strArray));

            }

        }
    }
}
