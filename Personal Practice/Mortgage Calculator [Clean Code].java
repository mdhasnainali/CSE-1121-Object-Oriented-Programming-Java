package com.cseru;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int principle = (int)readValue("Principle: ", 1000, 1_000_000);
        float annualInterestRate = (float) readValue("Annual Interest Rate: ", 1, 30);
        byte years = (byte)readValue("Period (Years): ", 1, 30);

        double mortgage = calculateMortgage(principle, annualInterestRate, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);

    }

    public static double calculateMortgage(int principle, float annualInterestRate , byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);

        double mortgage = principle
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return mortgage;
    }

    public static double readValue(String inputMessage, int min, int max) {
        Scanner scanner = new Scanner(System.in);

        double inputValue = 0;

        while(true) {
            System.out.print(inputMessage);
            inputValue = scanner.nextDouble();

            if(inputValue >= min && inputValue <= max)
                return inputValue;
            System.out.println("Enter a value between " + min +" and " + max +".");
        }
    }
}
