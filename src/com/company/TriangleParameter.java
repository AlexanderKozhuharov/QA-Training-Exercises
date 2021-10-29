package com.company;

import java.util.Scanner;

public class TriangleParameter {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter side a: ");
        double a = myObj.nextDouble();
        System.out.println("Enter side b: ");
        double b = myObj.nextDouble();
        System.out.println("Enter side c: ");
        double c = myObj.nextDouble();

        double perimeter = a + b + c;
        System.out.println("The perimeter is: " + perimeter);
    }
}