package com.IncomeTaxCalculator_;

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = scanner.nextDouble();

        double tax = calculateIncomeTax(income);

        System.out.println("Your income tax is: " + tax);

        scanner.close();
    }

    private static double calculateIncomeTax(double income) {
        double tax = 0;

        // Simplified tax slabs and rates (for illustration purposes)
        double slab1 = 250000;
        double slab2 = 500000;
        double slab3 = 1000000;

        double rate1 = 0.05;
        double rate2 = 0.1;
        double rate3 = 0.2;

        if (income <= slab1) {
            tax = 0;
        } else if (income <= slab2) {
            tax = (income - slab1) * rate1;
        } else if (income <= slab3) {
            tax = (slab2 - slab1) * rate1 + (income - slab2) * rate2;
        } else {
            tax = (slab2 - slab1) * rate1 + (slab3 - slab2) * rate2 + (income - slab3) * rate3;
        }

        return tax;
    }
}
