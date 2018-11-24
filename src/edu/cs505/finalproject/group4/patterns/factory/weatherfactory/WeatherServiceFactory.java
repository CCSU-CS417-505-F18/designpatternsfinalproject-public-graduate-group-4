package edu.cs505.finalproject.group4.patterns.factory.weatherfactory;


/**
 * The WeatherServiceFactory is an abstract Factory interface which defines
 * the Factory method and creates WeatherService object.
 *
 * @version 2.0
 */

public interface WeatherServiceFactory
{

	/**
	 * The method getWeatherService() is a Factory method which can be implemented
	 * by its subclass and gives an instance of the concrete WeatherService class.
	 * The implementation is done by the WeatherServiceCreatorFactory class
	 *
	 * @param sWeatherServiceType
	 * @throws InvalidWeatherProviderException if the user tries to access the 
	 * weather data from invalid API.
	 */

	public WeatherService getWeatherService(String sWeatherServiceType) throws InvalidWeatherProviderException;

}
