package com.cognizant.rithin.dsa.finacialforcasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principle Amount");
        double amount = scanner.nextDouble();

        System.out.println("Enter Number of years");
        int year = scanner.nextInt();

        System.out.println("Enter the rate");
        float rate = scanner.nextFloat();

        scanner.close();
        System.out.printf("%.2f",FinancialForcasting.calculate(amount,year,rate));
    }
}
