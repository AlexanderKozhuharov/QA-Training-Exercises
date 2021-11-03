package Homework0211;

import java.util.Locale;
import java.util.Scanner;

public class VacationAdvisor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input the number of people: ");
        int numberOfPeople = scn.nextInt();
        System.out.println("Please input the number of days: ");
        int numberOfDays = scn.nextInt();
        System.out.println("Please input the available budget: ");
        double budget = scn.nextDouble();
        System.out.println("Please input the desired vacation type: ");
        String type = scn.next();

        if (type.equalsIgnoreCase("beach")) {
            if (budget / numberOfDays / numberOfPeople < 50) {
                System.out.println("The recommended destination for you is Bulgaria.");
            } else {
                System.out.println("The recommended destination for you is outside of Bulgaria.");
            }
        } else if (type.equalsIgnoreCase("mountain")) {
            if (budget / numberOfDays / numberOfPeople < 30) {
                System.out.println("The recommended destination for you is Bulgaria.");
            } else {
                System.out.println("The recommended destination for you is outside of Bulgaria.");
            }
        } else {
            System.out.println("There is no information about this type of vacation.");
        }
    }
}
