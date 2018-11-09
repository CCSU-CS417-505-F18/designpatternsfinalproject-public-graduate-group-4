package edu.cs505.finalproject.group4.weather_parsing;

import org.json.JSONException;

public interface WeatherStrategy {

	public WeatherData parse(String weatherString) throws JSONException;
}
