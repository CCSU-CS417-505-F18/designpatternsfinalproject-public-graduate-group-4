package edu.cs505.finalproject.group4.patterns.template.weatherprinter;

import edu.cs505.finalproject.group4.patterns.strategy.weatherparsing.WeatherData;

/**
 * The WeatherPrinterInUnits is a subclass of WeatherPrinterTemplate
 * and it provides the implementation for all the abstract methods from 
 * the super class. WeatherPrinterInUnits gives the weather data in 
 * the form of units.
 *  
 * @version 1.0
 */

public class WeatherPrinterInUnits extends WeatherPrinterTemplate
{

	/**
	 * printStart() method is an abstract method which displays the startMessage 
	 * for the Weather data. 
	 * 
	 * @return string startMessage for the Weather data.
	 */
	
	protected String printStart() 
	{
		String sStartMessage = "Printing todays Weather for our city";
		System.out.println(sStartMessage); 
		return sStartMessage;
	}

	/**
	 * formattedPrintTemplate() method is an abstract method which displays the  
	 * TemperatureMessage for the Weather data in form of 
	 * units such as Average/Minimum/Maximum Temperature.
	 * 
	 * @param wd object of the WeatherData class created in weather_parsing package.
	 * @return string TemperatureMessage for the Weather data.
	 */
	
	protected String formatedPrintTemperature(WeatherData wd) 
	{
		String sTemperatureMessage = "Average Temperature    : "+ wd.getAvgTemp()+ " degrees Celcius\n"+
									"Minimum Temperature    : "+ wd.getMinTemp()+ " degrees Celcius\n"+
									"Maximum Temperature    : "+ wd.getMaxTemp()+ " degrees Celcius";
		System.out.println(sTemperatureMessage);
		return sTemperatureMessage;
	}
	
	/**
	 * formatedPrintHumidity() method is an abstract method which displays the  
	 * HumidityMessage in unit form(percentage). 
	 * 
	 * @param wd object of the WeatherData class created in weather_parsing package.
	 * @return string HumidityMessage for the Weather data.
	 */
	
	protected String formatedPrintHumidity(WeatherData wd) 
	{
		String sHumidityMessage = "Humidity in Percentage : " + wd.getHumidity() + " %";
		System.out.println(sHumidityMessage);
		return sHumidityMessage;
	}

	/**
	 * printEnd() method is an abstract method which displays the endMessage  
	 * for the Weather data. 
	 * 
	 * @return null nothing.
	 */
	
	protected String printEnd() 
	{
		System.out.println("End of Weather Weather Details!\n\n");
		return null;
	}

}
