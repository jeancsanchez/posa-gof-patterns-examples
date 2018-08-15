package com.github.jeancsanchez.estrutural.facade.moda;

public class SistemaTemperatura {

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = fahrenheit - 32 / 1.8;
        System.out.println(celsius + " ºC");
        return celsius;
    }
}
