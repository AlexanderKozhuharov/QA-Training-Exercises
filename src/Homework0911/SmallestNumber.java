package Homework0911;

public class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("The smallest number is: " + smallestNumber(3, 3, -6));
    }

    public static double smallestNumber(double num1, double num2, double num3) {
        double smallest = 0;
        if ((num1 < num2) && (num1 < num3)) {
            smallest = num1;
        } else if ((num2 < num1) && (num2 < num3)) {
            smallest = num2;
        } else if ((num3 < num1) && (num3 < num2)) {
            smallest = num3;
        } else if ((num1 == num2) && (num2 == num3)) {
            smallest = num1;
        }
        return smallest;
    }
}
    
