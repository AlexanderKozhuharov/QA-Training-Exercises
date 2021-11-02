package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int factorial = 1;
        for (int i = n; i>0; i--){
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
