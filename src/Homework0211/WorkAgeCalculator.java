package Homework0211;

import java.util.Scanner;

public class WorkAgeCalculator {
    public static void main(String[] args) {
        System.out.print("Please enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age < 0 ){
            System.out.print("Please enter a valid age: ");
        }
        else if (age >= 16) {
            System.out.println("You are eligible to work.");

        } else {
            System.out.println("You are not eligible to work.");
        }

    }
}
