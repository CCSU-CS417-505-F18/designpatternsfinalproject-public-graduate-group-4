package edu.cs505.finalproject.group4.patterns.strategy.weatherparsing;

import java.text.ParseException;


/**
 * WeatherStrategy is an interface for Strategy pattern and used for weather data 
 * parsing. The Concrete implementation classes of the parsing Strategy will be 
 * implementing the parse function and return the result as an instance of 
 * WeatherData class.
 * 
 * @version 2.0
 */
public interface WeatherStrategy {
	
	/**
	 * The parse() method will parse the weather data which is fetched from the
	 * weather API in string using JSONObject.
	 * @param weatherString weather data fetched from weather API in string format
	 * @throws ParseException indicate a problem with the API, attempt to parse	
	 * malformed documents, problem while creating or parsing the JASON data.
	 */

	public WeatherData parse(String weatherString) throws ParseException;
}