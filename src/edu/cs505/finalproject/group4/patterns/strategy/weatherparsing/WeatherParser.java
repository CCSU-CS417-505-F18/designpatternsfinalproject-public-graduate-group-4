package edu.cs505.finalproject.group4.patterns.strategy.weatherparsing;

import org.json.JSONException;

/**
 * WeatherParser is a context class which sets the parsing strategy and calls
 * the parse implementation of the concrete class.
 * 
 * @version 1.0
 */
public class WeatherParser {

	WeatherStrategy ws;

	/** 
	 * The parseWeatherData() will be invoked by the client to parse the Weather
	 * data which is in string format. It will call the concrete implementation
	 * of the parse function by concrete WeatherStrategy implementer class.
	 * 
	 * @param w weather data instance fetched from the API in string format 
	 * @return wd returns the parsed results as a Weather Data Object
	 * @throws JSONException indicate a problem with JASON API, attempt to parse	
	 * malformed documents, problem while creating or parsing the JASON data.
	 */
	
	public WeatherData parseWeatherData(String w) throws JSONException
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
	
	public void setParser(WeatherStrategy jsonStrategyWeatherParser) {
		ws = jsonStrategyWeatherParser;		
	}
	
}


