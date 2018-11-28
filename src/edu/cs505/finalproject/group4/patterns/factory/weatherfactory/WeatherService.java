package edu.cs505.finalproject.group4.patterns.factory.weatherfactory;

import java.io.IOException;
import java.text.ParseException;

/**
 * WeatherService is an interface which is extended by the concrete product
 * class. It will allow user to get the Weather data.
 *
 * @version 2.0
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
     * @throws IOException whenever an input or output is failed.
     * @throws ParseException indicate a problem with the API, attempt to parse	
     * malformed documents, problem while creating or parsing the JSON data.
     * @return String weather data for a particular city is returned as String.
	 */

	public String getWeatherData(String inputs) throws IOException, ParseException;

}

