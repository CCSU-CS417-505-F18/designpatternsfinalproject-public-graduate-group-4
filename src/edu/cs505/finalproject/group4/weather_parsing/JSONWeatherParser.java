package edu.cs505.finalproject.group4.weather_parsing;

import org.json.JSONException;
import org.json.JSONObject;


public class JSONWeatherParser implements WeatherStrategy {


	public WeatherData parse(String weatherString) throws JSONException{
		WeatherData wd = new WeatherData();
		double kelvin = 273.15;
		
		
		JSONObject jsonObj = (weatherString != null) ? new JSONObject(weatherString) : null;	        
		JSONObject mainJsonObj = new JSONObject((jsonObj != null) ? jsonObj.optString("main", null) : null);

		String tempAvg = (mainJsonObj != null) ? mainJsonObj.optString("temp", null) : null;
		String tempMin = (mainJsonObj != null) ? mainJsonObj.optString("temp_min", null) : null;
		String tempMax = (mainJsonObj != null) ? mainJsonObj.optString("temp_max", null) : null;
		String humidity = (mainJsonObj != null) ? mainJsonObj.optString("humidity", null) : null;
				
		wd.setMaxTemp((float) (Float.parseFloat(tempMax)-kelvin));
		wd.setMinTemp((float) (Float.parseFloat(tempMin)-kelvin));
		wd.setHumidity((float)Float.parseFloat(humidity));
		wd.setAvgTemp((float) (Float.parseFloat(tempAvg)-kelvin));
		
		return wd;
	}
}
