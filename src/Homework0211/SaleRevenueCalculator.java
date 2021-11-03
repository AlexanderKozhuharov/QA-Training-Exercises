package Homework0211;

import java.util.Scanner;

public class SaleRevenueCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Please enter the quantity: ");
        double quantity = input.nextDouble();
        double revenue = unitPrice * quantity;
        double discount;
        if (quantity > 100 && quantity < 120) {
            discount = 15;
            System.out.println("The revenue from the sale is: " + (revenue - (revenue * (discount / 100))) + "$");
            System.out.println("The discount is: " + (revenue * (discount / 100)) + "$(" + discount + "%)");
        } else if (quantity > 120) {
            discount = 20;
            System.out.println("The revenue from the sale is: " + (revenue - (revenue * (discount / 100))) + "$");
            System.out.println("The discount is: " + (revenue * (discount / 100)) + "$(" + discount + "%)");
        } else if (quantity < 100) {
            discount = 0;
            System.out.println("The revenue from the sale is: " + (revenue - (revenue * (discount / 100))) + "$");
            System.out.println("The discount is: " + (revenue * (discount / 100)) + "$(" + discount + "%)");
        }
    }
}
