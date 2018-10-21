package edu.cs505.smarthome.group4;

/**
 * Exception thrown when an invalid forecast is requested
 */
public class ForecastException extends Exception {

	public ForecastException(String details){
        super(details);
    }
}
