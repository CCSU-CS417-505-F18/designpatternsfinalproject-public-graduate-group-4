package edu.cs505.finalproject.group4.patterns.factory.weatherfactory;

public class InvalidWeatherProviderException  extends Exception {
    public InvalidWeatherProviderException(String message) {
        super(message);
    }
}
