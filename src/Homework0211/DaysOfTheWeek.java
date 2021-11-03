package Homework0211;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        System.out.print("Please enter a number between 1 and 7: ");
        Scanner input = new Scanner(System.in);
        int dayIndex = input.nextInt();
        String day;
        switch(dayIndex){
            case 1:
                day = "Monday";
                System.out.println(String.format("The %sst day of the week is ", dayIndex) + day + '.');
                break;
            case 2:
                day = "Tuesday";
                System.out.println(String.format("The %snd day of the week is ", dayIndex) + day + '.');
                break;
            case 3:
                day = "Wednesday";
                System.out.println(String.format("The %srd day of the week is ", dayIndex) + day + '.');
                break;
            case 4:
                day = "Thursday";
                System.out.println(String.format("The %sth day of the week is ", dayIndex) + day + '.');
                break;
            case 5:
                day = "Friday";
                System.out.println(String.format("The %sth day of the week is ", dayIndex) + day + '.');
                break;
            case 6:
                day = "Saturday";
                System.out.println(String.format("The %sth day of the week is ", dayIndex) + day + '.');
                break;
            case 7:
                day = "Sunday";
                System.out.println(String.format("The %sth day of the week is ", dayIndex) + day + '.');
                break;
            default:
                System.out.println("Invalid input!");

        }
    }
}
