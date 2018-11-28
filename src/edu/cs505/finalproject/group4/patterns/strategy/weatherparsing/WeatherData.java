package edu.cs505.finalproject.group4.patterns.strategy.weatherparsing;


/**
 * WeatherData class will handle the Temperature and Humidity which is fetched from
 * the OpenWeatherMAP API. The temperature is handled in terms of Minimum, Maximum
 * and Average Temperature. There is a constructor for the WeatherData which is 
 * initialized to 0.
 * 
 * @version 2.0
 */

public class WeatherData 
{
	
	private float humidity;
	private float minTemp;
	private float maxTemp;
	private float avgTemp;
	
	public WeatherData()
	{
		humidity = 0;
		minTemp = 0;
		maxTemp = 0;
		avgTemp = 0;
	}
	
	/**
	 * getHumidity() method gets the Humidity from the Weather API.
	 * 
	 * @return Humidity the Humidity of weather data.
	 */
	
	public float getHumidity() 
	{
		return humidity;
	}
	
	/**
	 * setHumidity() method sets the humidity value of weather data.
	 * 
	 * @param humidity humidity fetched from weather API.
	 */
	
	public void setHumidity(float humidity)
	{
		this.humidity = humidity;
	}
	
	/**
	 * getMinTemp() method gets the minimum temperature from the Weather API.
	 * @return MinTemp the Minimum temperature of the weather data.
	 */
	
	public float getMinTemp() 
	{
		return minTemp;
	}
	
	/**
	 * setMinTemp() method sets the minimum temperature of the Weather data.
	 * 
	 * @param minTemp Minimum Temperature fetched from weather API.
	 */
	
	public void setMinTemp(float minTemp) 
	{
		this.minTemp = minTemp;
	}
	
	/**
	 * getMaxTemp() method gets the maximum temperature from the Weather API.
	 * @return MaxTemp the Maximum temperature of the weather data.
	 */
	
	public float getMaxTemp() 
	{
		return maxTemp;
	}
	
	/**
	 * setMaxTemp() method sets the maximum temperature of the Weather data
	 * 
	 * @param maxTemp Maximum Temperature fetched from weather API.
	 */
	
	public void setMaxTemp(float maxTemp) 
	{
		this.maxTemp = maxTemp;
	}
	
	/**
	 * getAvgTemp() method gets the average temperature from the Weather API.
	 * @return the Average temperature of the weather data.
	 */
	
	public float getAvgTemp()
	{
		return avgTemp;
	}

	/**
	 * setAvgTemp() method sets the average temperature of the Weather data
	 * 
	 * @param avgTemp Average Temperature fetched from weather API.
	 */
	
	public void setAvgTemp(float avgTemp) 
	{
		this.avgTemp = avgTemp;
	}
	
	/**
	 * printWeatherData() method prints the weather data on screen.
	 */
	
	public void printWeatherData()
	{
		System.out.println("Avg Temperature : " + avgTemp);
		System.out.println("Min Temperature : " + minTemp);
		System.out.println("Max Temperature : " + maxTemp);
		System.out.println("Humidity        : " + humidity + " %");
		
	}
	

}
