package edu.cs505.finalproject.group4.patterns.strategy.weatherparsing;

import java.text.ParseException;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * JSONWeatherParser implements WeatherStrategy interface. This is a concrete
 * implementation of WeatherStrategy. OpenWeatherMaps API uses JASONObject. The 
 * JSONWeatherParser class gets the weather data from the API in the form of a
 * string and then parses the string using JSONObject. It returns the parsed 
 * result as WeatherData object.
 * 
 * @version 2.0
 */

public class JSONWeatherParser implements WeatherStrategy {

	/**
	 * The parse () is a concrete parsing function which takes the weather data
	 * in the string format. It will parse the input string and creates a WeatherData 
	 * object.
	 * 
	 * @param weatherString weather data fetched from API in form of String
	 * @return wd parsed result as an instance of Weather Data Object
	 * @throws ParseException indicate a problem with the API, attempt to parse	
	 * malformed documents, problem while creating or parsing the JASON data.
	 */
	
	public WeatherData parse(String weatherString) throws ParseException{
		WeatherData wd = null;
		double kelvin = 273.15;
		
		
		JSONObject jsonObj;
		try {
			wd = new WeatherData();
			jsonObj = (weatherString != null) ? new JSONObject(weatherString) : null;
			JSONObject mainJsonObj = new JSONObject((jsonObj != null) ? jsonObj.optString("main", null) : null);
			String tempAvg = (mainJsonObj != null) ? mainJsonObj.optString("temp", null) : null;
			String tempMin = (mainJsonObj != null) ? mainJsonObj.optString("temp_min", null) : null;
			String tempMax = (mainJsonObj != null) ? mainJsonObj.optString("temp_max", null) : null;
			String humidity = (mainJsonObj != null) ? mainJsonObj.optString("humidity", null) : null;
					
			wd.setMaxTemp((float) (Float.parseFloat(tempMax)-kelvin));
			wd.setMinTemp((float) (Float.parseFloat(tempMin)-kelvin));
			wd.setHumidity((float)Float.parseFloat(humidity));
			wd.setAvgTemp((float) (Float.parseFloat(tempAvg)-kelvin));
			

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	        
		
		return wd;
	}

}
