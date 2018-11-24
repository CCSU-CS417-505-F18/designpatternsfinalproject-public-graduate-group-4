package edu.cs505.finalproject.group4.weather.client;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.JSONException;
//import org.json.JSONObject;


import edu.cs505.finalproject.group4.patterns.factory.weatherfactory.*;
import edu.cs505.finalproject.group4.patterns.iteration.weatheriterator.*;
import edu.cs505.finalproject.group4.patterns.strategy.weatherparsing.*;
import edu.cs505.finalproject.group4.patterns.template.weatherprinter.*;

/**
 * The WeatherClient class is the opening wedge to the Weather Application Implementation. 
 * An HTTPRequest is made to receive the get the response from API after checking 
 * the errors/failures. ExceptionHandling is done to handle the errors and bad 
 * response if the URL is not available/invalid. The Weather data is fetched from 
 * the Weather Station API based on the WEB_URL, CURRENT_URL, PARAM_CITY_NAME, ENCODING, 
 * PARAM_MODE, MODE, PARAMAPPID, APPID and the response is returned as jasonObj
 * which is then parsed to get the TEMP_MIN, TEMP_MAX, HUMIDITY based on the city name.
 * It also creates an instance of the JSON Weather data parser which calls the parse 
 * method of the parser class and prints the weather data. User has option to select how 
 * they want to display the weather on screen. They can choose among the two printing 
 * styles : UnitsBased and DescriptionBased. The instance of the Visitor class is created
 * which informs if the KnownVisitor/UnknownVisitor is at the door and the arrivalTime and 
 * left time of the Visitor. 
 * 
 * @author Sudha Bopini, Aditi Sharma, Neelima Ganti, Surabhi Agnihotri
 * @throws JSONException indicate a problem with JASON API, attempt to parse	
 * malformed documents, problem while creating or parsing the JASON data.
 * @version 1.0
 */

public class WeatherClient {

	public static void main(String args[]) throws ParseException, InvalidWeatherProviderException
	{
		try {

			WeatherServiceFactory creatorFactory = new WeatherServiceCreatorFactory();
			WeatherService openWebMapsService = creatorFactory.getWeatherService("OWM"); 
			WeatherData wd = get_and_printWeatherMessage(openWebMapsService);


			System.out.println("Please select one of the Weather Print Styles : ");
			Iterator<WeatherPrinterStyles> iter = WeatherPrinterStyles.getIterator();
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}

			System.out.println( );


			Scanner in = new Scanner(System.in);
			String userChoice = in.nextLine();
			WeatherPrinterStyles weatherStyle = WeatherPrinterStyles.valueOf("DescriptionBased");
			in.close();
			weatherStyle = WeatherPrinterStyles.valueOf(userChoice);

			switch(weatherStyle){
			case  DescriptionBased:
				WeatherDataPrinterInterface weatherPrinterDesc = new WeatherPrinterInDescription();
				weatherPrinterDesc.printWeather(wd);
				break;
			case  UnitsBased:
				WeatherDataPrinterInterface weatherPrinter = new WeatherPrinterInUnits();
				weatherPrinter.printWeather(wd);
				break;			
			}

			} catch (IOException e) {			
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		catch(IllegalArgumentException ie){
			System.out.println("Invalid Choice of style");
		}

	}

	/**
	 * We invoke the get_and_printWeatherMessage() method of the weather data service
	 * object. The OpenWebMapsWeatherService finally serves back the weather data.
	 * 
	 * @param ws object of the WeatherData 
	 * @return wd returns the weather data 
         * @throws JSONException indicate a problem with JASON API, attempt to parse	
         * malformed documents, problem while creating or parsing the JASON data.
         * @throws IOException whenever an input or output is failed.
	 */
	
	public static WeatherData get_and_printWeatherMessage(WeatherService ws) throws IOException, ParseException {
		String sCityName = "Hartford";		
		String todayWeather = ws.getWeatherData(sCityName);

		WeatherParser parser = new WeatherParser();
		parser.setParser(new JSONWeatherParser());
		WeatherData wd = parser.parseWeatherData(todayWeather);
		
		return wd;
	}


}
