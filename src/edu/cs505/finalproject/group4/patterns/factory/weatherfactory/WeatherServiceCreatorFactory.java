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
	 * @throws InvalidWeatherProviderException
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
