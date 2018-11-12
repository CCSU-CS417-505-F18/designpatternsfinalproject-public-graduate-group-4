/**
 * This package contains the implementation of Strategy pattern. An object 
 * is created which represents the strategies and a context object whose 
 * behavior varies as per its strategy product. WeatherStrategy is a 
 * Strategy interface which define an action and concrete strategy classes
 * implementing the Strategy interface. WeatherStrategy interface is for 
 * parsing the weather data fetched from the Weather API.WeatherParser is 
 * a context class which uses Strategy . It will set the parsing  strategy 
 * and calls the parse implementation of the concrete class. JSONWeatherParser
 * class implements WeatherStrategy. It will get the weather data in the form 
 * of String and then parses the data using JSONObject strategy. Since the 
 * OpenWeatherMAp API uses JASON we are taking JASONParser as one of the strategy 
 * that can be applied to parse the weather data. Similarly if we can include other
 * strategies as XMLParser. WeatherData returns the object that can we used in 
 * weatherprinter package to print the weather data on the screen.
 */

package edu.cs505.finalproject.group4.patterns.strategy.weatherparsing;