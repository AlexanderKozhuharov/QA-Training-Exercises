package com.company;

import java.util.Locale;
import java.util.Scanner;

public class FullName {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = myObj.nextLine();

        System.out.println("Enter your middle name:");
        String middleName = myObj.nextLine();

        System.out.println("Enter your last name:");
        String lastName = myObj.nextLine();

        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Your full name is: " + fullName);


    }
}

