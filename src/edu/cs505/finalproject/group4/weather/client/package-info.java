/**
 * This package contains the implementation of WeatherClient which is a 
 * main class. The WeatherClient class is the opening wedge to the Weather 
 * Application Implementation. An HTTPRequest is made to receive the get 
 * the response from API after checking the errors/failures. ExceptionHandling is
 * done to handle the errors and bad response if the URL is not available/invalid. 
 * The Weather data is fetched from the Weather Station API and the response is returned
 * as jsonObj which is then parsed to get the TEMP_MIN, TEMP_MAX, HUMIDITY based on the 
 * city name. It also creates an instance of the JSON Weather data parser which calls the parse 
 * method of the parser class and prints the weather data. User has option to select how 
 * they want to display the weather on screen. They can choose among the two printing 
 * styles : UnitsBased and DescriptionBased. The instance of the Visitor class is created
 * which informs if the KnownVisitor/UnknownVisitor is at the door and the arrivalTime and 
 * left time of the Visitor. We invoke the get_and_printWeatherMessage() method of the 
 * weather data service object. The OpenWebMapsWeatherService finally serves back the weather data.
 */

package edu.cs505.finalproject.group4.weather.client;