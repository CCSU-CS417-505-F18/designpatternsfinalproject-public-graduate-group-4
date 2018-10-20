package edu.cs505.finalproject.group4;

import java.io.IOException;
import edu.cs505.smarthome.group4.*;
/**
 * 
 * WeatherComponent is an interface with getCurrentWeatherByZipCode() method which gives the current 
 * weather conditions based on zip code.
 *
 * @version 1.0
 */

public interface WeatherComponent {
	
	/**
	 * Fetches the Current Weather details based on zip code.
	 *
	 * @param zipCode the zip code of the city
	 * @return CurrentWeather, which is a model class and contains the object for Temperature, Humidity, Rainfall, Sunrise and Sunset.
	 * @throws IOException Signals that an I/O exception has occurred
	 * @throws ForecastException that there is no valid forecast.
	 */
    
	public CurrentWeather getCurrentWeatherByZipCode(String zipCode) throws IOException, ForecastException;

}