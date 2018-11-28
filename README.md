CS505 Graduate Students - Final Project

Project: Smart Home
Team: Sudha Bopini, Aditi Sharma, Neelima Ganti, Surabhi Agnihotri

Shared component Functionality: Weather Implementation

Use: With this functionality we can fetch data from openweatherAPI and displayed on home screen.

Weather Implementation: Weather data will be displayed on the smart monitor. OpenweatherAPI leveraged to collect weather data to communicate with the sensor. The weather station displays the weather information such as temperature, humidity and successive weather forecasts. 

Weather component implements different design patterns for different purposes which includes 
 
edu.cs505.finalproject.group4.patterns.factory.weatherfactory: The factory pattern decides on certain criteria which object should be created, so it is easy to maintain this logic in one place, instead of searching it through the whole system.

edu.cs505.finalproject.group4.patterns.iteration.weatheriterator:

Iterator defines the interface for access and traversal of the elements.
The enum stores the list of all printing styles for Weather Data that are available. The iterator functionality is implemented as an Inner Static class to isolate the iterator from being used outside of the WeatherPrinterStyles. The isolationbased protection is necessary as the Iterator implementation only works on the enum value of the WeatherPrinterStyles.
 

edu.cs505.finalproject.group4.patterns.singleton.myconnection:  

This package has HTTPConnectionRegistry class which has httpMakeGETRequest method to get the response from API after checking the errors/failures.HTTPConnectionRegistry is the private constructor of Singleton class connectionProperties is an instance variable which will give the properties to form the URL. The properties are saved to the root folder and then gets loaded. 

edu.cs505.finalproject.group4.patterns.strategy.weather_parsing: 

OpenWeatherMaps API uses JSONObject. The JSONWeatherParser class gets the weather data from the API in the form of a string and then parses the string using JSONObject. It returns the parsed result as WeatherData object. 

edu.cs505.finalproject.group4.patterns.template.weatherprinter

WeatherPrinterTemplate is an abstract class which implements WeatherDataPrinterInterface. It defines template to execute its method. Here the template method() are made final so that it cannot be overridden. All operations used by this template method are made abstract so that their implementation is deferred to subclasses.
 

