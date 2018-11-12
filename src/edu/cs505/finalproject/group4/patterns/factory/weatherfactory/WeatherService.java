package edu.cs505.finalproject.group4.patterns.factory.weatherfactory;

import java.io.IOException;

import org.json.JSONException;
/**
 * 
 * WeatherService is an interface class which is extended by the concrete product
 * class. It will allow user to get the Weather data.
 * 
 * @version 1.0
 */
public interface WeatherService
{
	/**
	 * The method getWeatherData() will be implemented by the Weather 
	 * Service Provider concrete class(OpenWebMapsWeatherService) to fetch 
	 * data from the Weather API based WEB_URL, CURRENT_URL, PARAM_CITY_NAME
	 * ENCODING, PARAM_MODE, MODE, PARAMAPPID, APPID.
	 * 
	 * @param inputs valid city name to fetch the data from OpenWeatherMap API.
	 */
	public abstract String getWeatherData(String inputs) throws IOException, JSONException;
		
}
