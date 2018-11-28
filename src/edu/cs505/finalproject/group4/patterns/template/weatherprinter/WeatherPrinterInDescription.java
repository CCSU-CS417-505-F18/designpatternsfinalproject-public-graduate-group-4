package edu.cs505.finalproject.group4.patterns.template.weatherprinter;

import edu.cs505.finalproject.group4.patterns.strategy.weatherparsing.WeatherData;

/**
 * The WeatherPrinterInDescription is a subclass of WeatherPrinterTemplate
 * and it provides the implementation for all the abstract methods from 
 * the super class. WeatherPrinterInDescription gives the weather data in 
 * descriptive manner in the form of a String Message. 
 *  
 * @version 1.0
 */

public class WeatherPrinterInDescription extends WeatherPrinterTemplate
{
	
	/**
	 * printStart() method is an abstract method which displays the startMessage 
	 * for the Weather data. 
	 * 
	 * @return string startMessage for the Weather data.
	 */
	
	protected String printStart() 
	{
		String sStartMessage = "Describing todays Weather for our city";
		System.out.println(sStartMessage); 
		return sStartMessage;
	}

	/**
	 * formattedPrintTemplate() method is an abstract method which displays the  
	 * TemperatureMessage for the Weather data in form of 
	 * description such as the Weather is Cold/Sunny/Hot/Very Hot.
	 * 
	 * @param wd object of the WeatherData class created in weather_parsing package.
	 * @return string TemperatureMessage for the Weather data.
	 */
	
	protected String formatedPrintTemperature(WeatherData wd) 
	{
		String sTemperatureMessage = "";
		if(wd.getAvgTemp() <= 5)
		{
			sTemperatureMessage = "Today's Weather is very Cold";
		} else if(wd.getAvgTemp() > 5 && wd.getAvgTemp() <= 15 )
		{
			sTemperatureMessage = "Today's Weather is Cold";
		} else if(wd.getAvgTemp() > 15 && wd.getAvgTemp() <= 25 )
		{
			sTemperatureMessage = "Today's Weather is Sunny";
		} else if(wd.getAvgTemp() > 25 && wd.getAvgTemp() <= 35 )
		{
			sTemperatureMessage = "Today's Weather is Hotter";
		} else if(wd.getAvgTemp() > 35 && wd.getAvgTemp() <= 40 ) 
		{
			sTemperatureMessage = "Today's Weather is very Hot";
		} else 
		{
			sTemperatureMessage = "Today's Weather is Extreme";
		}
				
		System.out.println(sTemperatureMessage);
		return sTemperatureMessage;
	}

	/**
	 * formatedPrintHumidity() method is an abstract method which displays the  
	 * HumidityMessage in descriptive form such as Low/Normal/HighlyHumid. 
	 * 
	 * @param wd object of the WeatherData class created in weather_parsing package.
	 * @return string HumidityMessage for the Weather data.
	 */
	
	protected String formatedPrintHumidity(WeatherData wd)
	{
		String sHumidityMessage = "Humidity condition is ";
		if(wd.getHumidity() <= 60.0)
		{
			sHumidityMessage += "Low";
		} else if(wd.getHumidity() > 60.0 && wd.getHumidity() <= 80.0) 
		{
			sHumidityMessage += "Normal";
		} else if(wd.getHumidity() > 80.0 && wd.getHumidity() <= 90.0) 
		{
			sHumidityMessage += "Highly Humid";
		} else 
		{
			sHumidityMessage += "Extremely Humid";
		}
				
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
		System.out.println("End of Weather Weather Details for today!\n\n");
		return null;
	}

}

