package com.cseru;

import java.sql.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Weather weather;
        Date date = Date.valueOf("2021-04-21");
        weather = new Weather(23.6, 18.9, 32.1, 60, 2.02, date);
        weather.giveWeatherUpdate();
    }

}
