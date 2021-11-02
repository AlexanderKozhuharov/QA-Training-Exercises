package com.company;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = scn.nextInt();
        for (int i = num; i >= 0; i--) {
            if (i % 7 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
