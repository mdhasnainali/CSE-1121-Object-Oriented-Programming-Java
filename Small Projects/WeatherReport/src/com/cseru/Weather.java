package com.cseru;

import java.sql.Date;

public class Weather {
    private double averageTemperature;
    private double lowTemperature;
    private double highTemperature;
    private double humidity;
    private double precitipation;

    private Date date;

    public Weather(double averageTemperature, double lowTemperature, double highTemperature,
                   double humidity, double precitipation, Date date) {
        this.averageTemperature = averageTemperature;
        this.lowTemperature = lowTemperature;
        this.highTemperature = highTemperature;
        this.humidity = humidity;
        this.precitipation = precitipation;
        this.date = date;
    }

    public void giveWeatherUpdate() {
        System.out.println("Weather Update");
        System.out.println("=================");
        System.out.println("Date: " + date);
        System.out.println("Low Temperature: " + lowTemperature);
        System.out.println("High Temperature: " + highTemperature);
        System.out.println("Average Temperature: " + averageTemperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Precitipation: " + precitipation);
        System.out.println("=================");
    }
}
