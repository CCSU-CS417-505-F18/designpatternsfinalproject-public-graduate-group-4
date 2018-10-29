                                       CS505 Ð Weather Data 
By: Sudha Bopini, Surabhi Agnihotri, Neelima Ganti, Aditi Sharma

Interfaces: 
WeatherServiceFactory:  
This is an abstract Factory Interface which defines the Factory Method and creates WeatherService object. getWeatherService is factory method it can be implemented by its subclasses. Each concrete factory which implements the interface they can create their own implementation of each object.

WeatherService: 
The interface class will allow the users to get the WeatherData. WeatherService interface is implemented by the concrete product classes. getWeatherData is an abstract method it can be implemented by its subclasses.
 
Classes:
WeatherServiceCreatorFactory: 
Is a concrete factory. The WeatherServiceCreatorFactory class realizes the WeatherServiceFactory and provides the implementation for the getWeatherService method. The getWeatherService method creates an instance of the concrete Weather Service (Concrete product) class based on the parameter.

OpenWebMapsWeatherService: 
This is concrete product class which realizes the WeatherService and provides the implementation for getWeatherData method. 
OpenWebMapsWeatherService class is used for accessing weather data from Open Weather Map API. This service can provide Weather for a given city name.

LazyHTTPConnectionRegistry: 
The Lazy Singleton Class which only allows to create one instance of the class. The lazy Invocation is ensured by using the Inner class type of Singleton class. The instance of this class is used to send httpGET Request, it responds with the return value of the API Request after checking for errors or failures.


