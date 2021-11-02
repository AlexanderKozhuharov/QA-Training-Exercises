package com.company;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class NovLecture02 {
    public static void main(String[] args) {
        System.out.println("Input a number:");
        Scanner myScanner = new Scanner(System.in);
        String num = myScanner.nextLine();
        int countSymbols = num.length();

        switch (countSymbols) {
            case 2:
                System.out.println("It's a two-digit number");
                break;
            case 3:
                System.out.println("It's a three-digit number");
                break;
            case 4:
                System.out.println("It's a four-digit number");
                break;
            case 5:
                System.out.println("It's a five-digit number");
                break;
            case 6:
                System.out.println("It's a six-digit number");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
