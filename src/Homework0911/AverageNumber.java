package Homework0911;

public class AverageNumber {
    public static void main(String[] args) {
        System.out.println("The average of the three numbers is: " + average(1, 2, -6));
    }

    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
