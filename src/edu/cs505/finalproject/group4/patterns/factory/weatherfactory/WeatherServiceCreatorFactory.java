package edu.cs505.finalproject.group4.patterns.factory.weatherfactory;

import edu.cs505.finalproject.group4.patterns.factory.weatherfactory.WeatherService;

/**
 * The WeatherServiceCreatorFactory implements WeatherServiceFactory. It is a
 * concrete factory and realizes WeatherServiceFactory. It creates the
 * instance of the concrete Weather Service Provider class. It provides the
 * implementation of the getWeatherService() method.
 *
 * @version 2.0
 */
public class WeatherServiceCreatorFactory implements WeatherServiceFactory
{

	/**
	 * The method getWeatherService() creates an instance of the concrete
	 * WeatherService class based on the parameter.
	 *
	 * @param sWeatherServiceType takes the OpenWeatherMAP API(OWN)
	 * @return WeatherServiceType the Weather Service Handler concrete Class 
	 * and null if WeatherServiceType is not equal to "OWM"
	 * @throws InvalidWeatherProviderException if the user tries to access the
	 * data from invalid weather API.
	 */

	@Override
	public WeatherService getWeatherService(
			String sWeatherServiceType) throws InvalidWeatherProviderException
	{
		if(sWeatherServiceType.equals("OWM"))
			return (WeatherService) new OpenWebMapsWeatherService();
		throw new InvalidWeatherProviderException("No such Weather Service provider :"+sWeatherServiceType);
	}
}
