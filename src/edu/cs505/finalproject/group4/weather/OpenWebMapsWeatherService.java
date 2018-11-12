package edu.cs505.finalproject.group4.weather;


import java.io.IOException;
import java.net.URLEncoder;

import org.json.JSONException;
import org.json.JSONObject;

import edu.cs505.finalproject.group4.myconnection.LazyHTTPConnectionRegistry;

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

    private static final String WEB_URL = "http://api.openweathermap.org/data/2.5/";
    
    private static final String URL_CURRENT = "weather?";
    
    private static final String PARAM_CITY_NAME = "q=";
    
    private static final String PARAM_MODE = "mode=";

    private static final String PARAM_APPID = "appId=";

    private static final String MODE = "json";

    private static final String ENCODING = "UTF-8";

    private static final String APPID = "a3eb81a3fb976abdc5ac6350e116e914";
    
    /**
     * The method getWeatherData() is a concrete method that invokes the API back-end. It 
     * requires a valid city name to fetch the Weather data from the API.
     * 
     * @param inputs valid city name to fetch the data from OpenWeatherMap API.
     * @return weatherResponse weather data for a particular city is returned as String.
     */
    
	@Override
	public String getWeatherData(String inputs) throws IOException, JSONException 
	{
		LazyHTTPConnectionRegistry httpObject = LazyHTTPConnectionRegistry.getInstance();
		
		String weatherResponse = httpObject.httpMakeGETRequest(new StringBuilder()
                    .append(WEB_URL).append(URL_CURRENT)
                    .append(PARAM_CITY_NAME).append(URLEncoder.encode(inputs, ENCODING)).append("&")
                    .append(PARAM_MODE).append(MODE).append("&")
                    .append(PARAM_APPID).append(APPID)
                    .toString());

		return weatherResponse;
	}
}


