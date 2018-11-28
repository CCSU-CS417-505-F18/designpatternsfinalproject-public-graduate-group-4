package edu.cs505.finalproject.group4.patterns.strategy.weatherparsing;

import java.text.ParseException;

/**
 * WeatherParser is a context class which sets the parsing strategy and calls
 * the parse implementation of the concrete strategy.
 * 
 * @version 2.0
 */
public class WeatherParser 
{

	private WeatherStrategy ws;

	/** 
	 * The parseWeatherData() will be invoked by the client to parse the Weather
	 * data which is in string format. It will call the concrete implementation
	 * of the parse function by concrete WeatherStrategy implementer class.
	 * 
	 * @param w weather data instance fetched from the API in string format 
	 * @return wd returns the parsed results as a Weather Data Object
	 * @throws ParseException indicate a problem with the API, attempt to parse	
	 * malformed documents, problem while creating or parsing the JSON data.
	 */
	
	public WeatherData parseWeatherData(String w) throws ParseException
	{
		WeatherData wd = ws.parse(w);
		return wd;
	}
	
	/**
	 * The setParser() sets the concrete implementation strategy for the parsing of
	 * weather data.
	 * 
	 * @param jsonStrategyWeatherParser instance of weather data 
	 */
	
	public void setParser(WeatherStrategy jsonStrategyWeatherParser) 
	{
		ws = jsonStrategyWeatherParser;		
	}
	
}


