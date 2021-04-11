package com.cseru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double temperatureInFahrenheit = 100.0;
        String temperatureInCelsius = "Saturday Temperature: " + String.format("%.2f", temperatureInFahrenheit) + "F " + String.format("%.2f", fahrenheitToCelsius(temperatureInFahrenheit)) + "C";
        System.out.println(temperatureInCelsius);
    }

    public static double fahrenheitToCelsius(double temperatureInFahrenheit) {
        double temperatureInCelsius = (5.0 / 9.0) * (temperatureInFahrenheit - 32);
        return temperatureInCelsius;
    }
}

