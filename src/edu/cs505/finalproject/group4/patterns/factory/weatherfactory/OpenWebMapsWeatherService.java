package edu.cs505.finalproject.group4.patterns.factory.weatherfactory;

import java.io.IOException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.Properties;

import edu.cs505.finalproject.group4.patterns.singleton.httpconnectionsingleton.HTTPConnectionRegistry;

/**
 * The OpenWebMapsWeatherService is a concrete product class and implements
 * WeatherService. The implementation of the class is for accessing the
 * Weather Data from the Weather Station. It uses OpenWeatherMap API to fetch
 * the data. The application is getting the data based on city name. Below
 * are the variables used:
 * Web_URL for the API back-end to make the HTTP request
 * URL_CURRENT for Weather data selection
 * PARAM_CITY_NAME for the filtering the data based on the name of the city
 * PARAM_APPID is the users unique Application ID, error is thrown if the uniqueID is
 * missing or invalid
 * MODE is the return type format for the data
 * ENCODING is for the variable width character encoding capable of encoding all valid
 * code points for the returned string
 * APPID is the unique key, user should give for fetching the data from the API
 *
 * @version 1.0
 */

public class OpenWebMapsWeatherService implements WeatherService
{

    /**
     * The method getWeatherData() is a concrete method that invokes the API back-end. It
     * requires a valid city name to fetch the Weather data from the API.
     *
     * @param inputs valid city name to fetch the data from OpenWeatherMap API.
     * @return weatherResponse weather data for a particular city is returned as String.
     */

	@Override
	public String getWeatherData(String inputs) throws IOException, ParseException
	{
		HTTPConnectionRegistry httpObject = HTTPConnectionRegistry.getInstance();
		Properties connProp = httpObject.getConnectionProperties();
		String encoding = connProp.getProperty("encoding");
		String weatherResponse = httpObject.httpMakeGETRequest(new StringBuilder()
        .append(connProp.getProperty("open_webmap_url"))
        .append(connProp.getProperty("url_current"))
        .append(connProp.getProperty("param_city"))
        .append(URLEncoder.encode(inputs, encoding)).append("&")
        .append(connProp.getProperty("param_mode"))
        .append(connProp.getProperty("mode")).append("&")
        .append(connProp.getProperty("param_appid"))
        .append(connProp.getProperty("appid"))
        .toString());


		return weatherResponse;
	}
}

