/**
 * This package contains the implementation of Iterator pattern. The 
 * Iterator defines the interface for access and traversal of the elements. 
 * The WeatherStyleIteratorInterface is an interface which defines a method
 * that needs to be implemented by the concrete iterator. The iterator interface
 * provides a set of methods for traversing or modifying the collection using 
 * next()/hasNext(). WeatherPrinterStyles is an enum class which stores the list
 * of all printing styles for Weather Data that are available. WeatherStyleIterator 
 * is an inner class is used to iterate the Weather print styles and is made static 
 * as it is part of the enum. The inner class gets the list of styles through the 
 * next()/hasNext() methods. We are using Iterator as it provides a way to access 
 * the elements of an aggregate object without exposing its underlying representation. 
 */

package edu.cs505.finalproject.group4.patterns.iteration.weatheriterator;