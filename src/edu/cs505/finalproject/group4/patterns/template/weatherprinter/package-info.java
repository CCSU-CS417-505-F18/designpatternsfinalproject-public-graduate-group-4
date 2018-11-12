/**
 * This package contains the implementation of Template pattern. It is 
 * intended to outline the basic structure or “skeleton” of an algorithm, 
 * without explicitly defining (or advertising) the logic of each step within
 * the overall structure to the client. This pattern is ideal for complex 
 * algorithms that must be shared and executed by multiple classes, where each 
 * class must define their own specific implementation. WeatherDataPrinterInterface
 * is an interface for parsing the weather data. WeatherPrinterTemplate is an 
 * abstract class which implements WeatherDataPrinterInterface. Its defines template
 * to execute its method. Here the template method() are made final so that it cannot 
 * be overridden. All operations used by this template method are made abstract so that 
 * their implementation is deferred to subclasses. WeatherPrinterInDescription and 
 * WeatherPrinterInUnits are two concrete classes which extends WeatherPrinterTemplate
 * and provides the implementation for all the abstract methods from the super class. 
 */

package edu.cs505.finalproject.group4.patterns.template.weatherprinter;