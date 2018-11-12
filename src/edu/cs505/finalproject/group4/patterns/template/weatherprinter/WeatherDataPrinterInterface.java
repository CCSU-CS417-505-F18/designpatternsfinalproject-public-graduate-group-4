package edu.cs505.finalproject.group4.patterns.template.weatherprinter;

import edu.cs505.finalproject.group4.patterns.strategy.weatherparsing.WeatherData;

/**
 * The WeatherDataPrinterInterface is an interface for Weather Data printing.
 * Concrete class will have the implementation for the printWeather() method. 
 * 
 * @version 1.0
 */

public interface WeatherDataPrinterInterface {
	
	/**
	 * The printWeather() method takes an argument as object of the WeatherData
	 * class and will do the printing of the weather information fetched from API.
	 * @param wd object of the WeatherData class created in weather_parsing package
	 * @return void nothing
	 */

	void printWeather(WeatherData wd);
	
}