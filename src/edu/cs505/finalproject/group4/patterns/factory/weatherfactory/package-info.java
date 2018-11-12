/**
 * This package contains the implementation of Abstract Factory pattern
 * with WeatherServiceFactory, WeatherService as interfaces and 
 * OpenWebMapsWeatherService , WeatherServiceCreatorFactory as classes. 
 * The factory is not only for creating objects. It is more complex than 
 * that. The factory pattern decides on certain criteria what object should
 * be created, so it is easy to maintain this logic in one place, instead of 
 * searching it through the whole system. This creation logic also becomes 
 * extensible with the factory. It is easy to add a new class to the factory,
 * without touching the client code, that uses this factory. 
 * WeatherServiceFactory is an Abstract Factory interface which declares an 
 * interface for operations that create the abstract product objects.
 * WeatherServiceCreatorFactory is a Concrete Factory that will implement the
 * operations declared in WeatherServiceFactory to create concrete product objects.
 * WeatherService is a product interface to be implemented by the concrete
 * product classes. 
 * OpenWebMapsWeatherService is a concrete product class which implements 
 * WeatherService.
 * The overall functionality of this package is to get the Weather data from 
 * OpenWebMapsWeeatherService.
 */

package edu.cs505.finalproject.group4.patterns.factory.weatherfactory;