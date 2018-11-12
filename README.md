CS505 Graduate Students - Final Project

Project: Smart Home
Team: Sudha Bopini, Aditi Sharma, Neelima Ganti, Surabhi Agnihotri

Overview: 
SmartHome automation project performs various functionalities including DoorLock, door unlock, weather forecast, temperature controls. User interaction and actions will be controlled through a smart display. This device works as central hub. Smart door locks offer access control feature to the home, performing auto lock and auto unlock. Using a Raspberry Pi and Camera, picture can be captured and be displayed on smart display to enable users to remotely unlock a door. Weather data will be collected from OpenweatherAPI and displayed on the screen as well. 

Shared component Functionality: 
Weather Implementation: Weather data will be displayed on the smart monitor. OpenweatherAPI leveraged to collect weather data to communicate with the sensor and the Raspberry Pi. The weather station displays the weather information such as temperature, humidity and successive weather forecasts. 

Current Project implements different design patterns for different purposes which includes 
 
edu.cs505.finalproject.group4.patterns.factory.weatherfactory: This package contains the implementation of Abstract Factory pattern. The factory pattern decides on certain criteria which object should be created, so it is easy to maintain this logic in one place, instead of searching it through the whole system. 

OpenWebMapsWeatherService: The OpenWebMapsWeatherService is a concrete product class and implements WeatherService. The implementation of the class is for accessing the Weather Data from the Weather Station. It uses OpenWeatherMap API to fetch the data.

WeatherService: WeatherService is an interface class which is extended by the concrete product class. It will allow user to get the Weather data.

The WeatherServiceCreatorFactory: Implements WeatherServiceFactory. It is a
concrete factory and realizes WeatherServiceFactory. It creates the 
instance of the concrete Weather Service Provider class. 

WeatherServiceFactory: It is an abstract Factory interface which defines the Factory method and creates WeatherService object. 

edu.cs505.finalproject.group4.patterns.singleton.myconnection:  This package   implements Singleton pattern

LazyHTTPConnectionRegistry : It is a Singleton Class which allows to create one instance of the class. LazyHTTPConnectionRegistry is the private constructor of Singleton class  which has getInstance() method which returns Instance of the object of the Singleton class.

edu.cs505.finalproject.group4.patterns.strategy.weather_parsing: This package implements weather strategy 

WeatherStrategy: It is an interface for the Weather Data Parsing. It serves as the Interface for the Strategy  Pattern. Concrete implementation classes of the Parsing Strategy will be implementing the parse function and return the result as an instance of Weather Data class.

JSONWeatherParser: Implements WeatherStrategy interface. This is a concrete
implementation of WeatherStrategy. OpenWeatherMaps API uses JASONObject. The 
JSONWeatherParser class gets the weather data from the API in the form of a
             string and then parses the string using JSONObject. It returns the parsed 
result as WeatherData object. 

WeatherParser:  It is a context class which sets the Parsing Strategy and calls the parse implementation of the concrete class.

WeatherData: This class implements Min, Max, Avg of temperature and Humidity.

edu.cs505.finalproject.group4.patterns.template.weatherprinter: This package implements Template pattern. It is intended to outline the basic skeletal structure of an algorithm without explicitly defining logic of each step. 

WeatherDataPrinterInterface: It is an interface for parsing the weather data.
 
WeatherPrinterTemplate:  It is an  abstract class which implements WeatherDataPrinterInterface. 

WeatherPrinterInDescription, WeatherPrinterInUnits: These are two concrete classes which extends WeatherPrinterTemplate and provides the implementation for all the abstract methods from the super class.

edu.cs505.finalproject.group4.patterns.iteration.weatheriterator: This package contains the implementation of Iterator pattern. The Iterator defines the interface for access and traversal of the elements. 
             
WeatherStyleIteratorInterface:  It is an interface which defines a method that needs to be implemented by the concrete iterator.     
                                             
WeatherPrinterStyles: It is an enum class which stores the list of printing styles for Weather Data 

WeatherStyleIterator: It is an inner class is used to iterate the Weather print styles and is made static as it is part of the enum. The inner class gets the list of styles through the next()/hasNext() methods. Iterator  provides a way to access the elements of an aggregate object without exposing its underlying representation.

