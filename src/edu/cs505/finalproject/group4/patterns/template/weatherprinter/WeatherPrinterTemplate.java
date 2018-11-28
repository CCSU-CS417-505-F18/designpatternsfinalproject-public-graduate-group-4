package edu.cs505.finalproject.group4.patterns.template.weatherprinter;

import edu.cs505.finalproject.group4.patterns.strategy.weatherparsing.WeatherData;

/**
 * The WeatherPrinterTemplate is an abstract class which implements 
 * WeatherDataPrinterInterface. It defines the template to execute
 * its methods. 
 *  
 * @version 1.0
 */

public abstract class WeatherPrinterTemplate implements WeatherDataPrinterInterface
{
	
	/**
	 * printWeather() method is a template method which provides a skeleton 
	 * calling sequence of methods and it cannot be overridden. Therefore it 
	 * is final. Implementation of these steps are deferred to its subclasses
	 * which implements the printStart(), formatedPrintTemperature(),
	 * formatedPrintHumidity() and printEnd(). 
	 * 
	 * @param wd object of the WeatherData class created in weather_parsing package
	 */

	public final  void printWeather(WeatherData wd)
	{
		
		printStart();
		
		formatedPrintTemperature(wd);
		
		formatedPrintHumidity(wd);
		
		printEnd();		
	}
	
	/**
	 * printStart() method is an abstract method which displays the startMessage 
	 * for the Weather data. Each subclass will have their own start message for
	 * displaying the heading of the message.
	 * 
	 * @return string startMessage for the Weather data.
	 */
	
	protected abstract String printStart();
	
	/**
	 * formattedPrintTemplate() method is an abstract method which displays the  
	 * TemperatureMessage for the Weather data in form of units(Average/Min/Max)
	 * or descriptive(Cold/Sunny/Hot/Very Hot) depending upon the subclasses.
	 * Each subclass will have their own TemperatureMessage for displaying.
	 * 
	 * @return string TemperatureMessage for the Weather data.
	 */
	
	protected abstract String formatedPrintTemperature(WeatherData wd);
	
	/**
	 * formatedPrintHumidity() method is an abstract method which displays the  
	 * HumidityMessage for the particular day in form of unit(percentage) or 
	 * descriptive(Low/Normal/HighlyHumid). 
	 * Each subclass will have their own TemperatureMessage for displaying.
	 * 
	 * @return string HumidityMessage for the Weather data.
	 */
	
	protected abstract String formatedPrintHumidity(WeatherData wd);
	
	/**
	 * printEnd() method is an abstract method which displays the endMessage  
	 * for the Weather data. Each subclass will have their own start message for
	 * displaying the end of the message.
	 * 
	 * @return null nothing.
	 */
	
	protected abstract String printEnd();

}
