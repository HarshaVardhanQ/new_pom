package com.mycompany.app;

import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (as a decimal): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        double compoundInterest = calculateCompoundInterest(principal, annualInterestRate, years);

        System.out.printf("The compound interest after %d years is: $%.2f\n", years, compoundInterest);
    }

    public static double calculateCompoundInterest(double principal, double annualInterestRate, int years) {
        double compoundInterest = principal * Math.pow(1 + annualInterestRate, years) - principal;
        return compoundInterest;
    }
}
