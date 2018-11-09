package edu.cs505.finalproject.group4.weather_parsing;

import org.json.JSONException;

public class WeatherParser {

	WeatherStrategy ws;

	
	public WeatherData parseWeatherData(String w) throws JSONException
	{
		WeatherData wd = ws.parse(w);
		return wd;
	}
	
	
	public void setParser(WeatherStrategy jsonStrategyWeatherParser) {
		ws = jsonStrategyWeatherParser;		
	}
	
}
