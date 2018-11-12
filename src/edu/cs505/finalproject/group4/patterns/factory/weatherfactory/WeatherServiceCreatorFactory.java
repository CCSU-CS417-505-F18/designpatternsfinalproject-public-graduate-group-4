package edu.cs505.finalproject.group4.patterns.factory.weatherfactory;

import edu.cs505.finalproject.group4.patterns.factory.weatherfactory.WeatherService;

/**
 * The WeatherServiceCreatorFactory implements WeatherServiceFactory. It is a
 * concrete factory and realizes WeatherServiceFactory. It creates the 
 * instance of the concrete Weather Service Provider class. It provides the 
 * implementation of the getWeatherService() method.
 * 
 * @version 1.0
 */
public class WeatherServiceCreatorFactory implements WeatherServiceFactory 
{
	
	/**
	 * The method getWeatherService() creates an instance of the concrete
	 * WeatherService class based on the parameter.
	 *
	 * @param sWeatherServiceType 
	 * @return WeatherServiceType the Weather Service Handler concrete Class
	 * @return null nothing if the Weather Service type is not equal to OWN.
	 */
	@Override
	public WeatherService getWeatherService(
			String sWeatherServiceType) 
	{
		if(sWeatherServiceType.equals("OWM"))
			return (WeatherService) new OpenWebMapsWeatherService();
		return null;
	}
}
