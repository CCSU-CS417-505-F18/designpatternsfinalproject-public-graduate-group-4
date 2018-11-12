package edu.cs505.finalproject.group4.patterns.strategy.weatherparsing;


/**
 * WeatherData class will handle the Temperature and Humidity which is fetched from
 * the OpenWeatherMAP API. The temperature is handled in terms of Minimum, Maximum
 * and Average Temperature. There is a constructor for the WeatherData which is 
 * initialized to 0.
 * 
 * @version 1.0
 */

public class WeatherData {
	
	private float Humidity;
	private float MinTemp;
	private float MaxTemp;
	private float AvgTemp;
	
	WeatherData(){
		Humidity = 0;
		MinTemp = 0;
		MaxTemp = 0;
		AvgTemp = 0;
	}
	
	/**
	 * getHumidity() method gets the Humidity from the Weather API.
	 * 
	 * @return Humidity the Humidity of weather data.
	 */
	
	public float getHumidity() {
		return Humidity;
	}
	
	/**
	 * setHumidity() method sets the humidity value of weather data.
	 */
	
	public void setHumidity(float humidity) {
		Humidity = humidity;
	}
	
	/**
	 * getMinTemp() method gets the minimum temperature from the Weather API.
	 * @return MinTemp the Minimum temperature of the weather data.
	 */
	
	public float getMinTemp() {
		return MinTemp;
	}
	
	/**
	 * setMinTemp() method sets the minimum temperature of the Weather data.
	 */
	
	public void setMinTemp(float minTemp) {
		MinTemp = minTemp;
	}
	
	/**
	 * getMaxTemp() method gets the maximum temperature from the Weather API.
	 * @return MaxTemp the Maximum temperature of the weather data.
	 */
	
	public float getMaxTemp() {
		return MaxTemp;
	}
	
	/**
	 * setMaxTemp() method sets the maximum temperature of the Weather data
	 */
	
	public void setMaxTemp(float maxTemp) {
		MaxTemp = maxTemp;
	}
	
	/**
	 * getAvgTemp() method gets the average temperature from the Weather API.
	 * @return the Average temperature of the weather data.
	 */
	
	public float getAvgTemp() {
		return AvgTemp;
	}

	/**
	 * setAvgTemp() method sets the average temperature of the Weather data
	 */
	
	public void setAvgTemp(float avgTemp) {
		AvgTemp = avgTemp;
	}
	
	/**
	 * printWeatherData() method prints the weather data on screen.
	 */
	
	public void printWeatherData()
	{
		System.out.println("Avg Temperature : " + AvgTemp);
		System.out.println("Min Temperature : " + MinTemp);
		System.out.println("Max Temperature : " + MaxTemp);
		System.out.println("Humidity        : " + Humidity + " %");
		
	}
	

}
