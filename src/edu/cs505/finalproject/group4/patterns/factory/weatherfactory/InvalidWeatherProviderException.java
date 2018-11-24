package edu.cs505.finalproject.group4.patterns.factory.weatherfactory;

/**
 *
 * InvalidWeatherProviderException extends Exception class. An exception
 * is thrown if the user tries to access the weather data from invalid 
 * Weather API provider.
 *
 * @version 1.0
 */

public class InvalidWeatherProviderException  extends Exception {
    public InvalidWeatherProviderException(String message) {
        super(message);
    }
}
