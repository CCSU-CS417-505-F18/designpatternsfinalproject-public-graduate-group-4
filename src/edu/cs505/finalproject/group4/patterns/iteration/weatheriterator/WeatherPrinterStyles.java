package edu.cs505.finalproject.group4.patterns.iteration.weatheriterator;

import java.util.Iterator;


/**
 * The Iterator Design Pattern is implemented as an Enum. The enum stores the list 
 * of all printing styles for Weather Data that are available. The iterator 
 * functionality is implemented as an Inner Static class to isolate the iterator 
 * from being used outside of the WeatherPrinterStyles. The isolation based protection
 * is necessary as the Iterator implementation only works on the enum value of the 
 * WeatherPrinterStyles.
 * 
 * @version 2.0
 */

public enum WeatherPrinterStyles {

	/**
	 * 
	 * UnitsBased and DescriptionBased are the list of printing styles available. This 
	 * list will be iterated by the implementation in the inner class
	 */
	UnitsBased, 
	DescriptionBased;
	
	/**
	 * The getIterator() method is a static method which creates and returns the instance 
	 * of the Iterator Inner class. This method is static as there cannot be any instance 
	 * created for the WeatherPrinterStyles enum.
	 */
	
	public static Iterator<WeatherPrinterStyles> getIterator() {
		return new WeatherStyleIterator();
	}

	/**
	 * The static inner class WeatherStyleIterator implements the WeatherStyleIteratorInterface
	 * interface. WeatherStyleIterator inner class is isolated to make sure it is only used to 
	 * iterate the Weather print styles and is made static as it is part of the enum 
	 * WeatherPrinterStyles.This class is concrete implementation of Iterator design pattern 
	 * which implements next and hasNext method. The inner class implements the methods to get 
	 * the list of styles through the next() function. currentPos keeps the track of the current
	 * value that is being iterated.
	 */
	
	private static class WeatherStyleIterator implements Iterator<WeatherPrinterStyles> {
		
		private int currentPos;

		/**
		 * The hasNext() method should be implemented by the concrete iterator implementation.
		 * It checks if the iterator's current position is still valid to get next value
		 * in the list.
		 * 
		 * @return boolean true if the iterator is not at the end of the list and false if the
		 * iterator is at the end of the list.
		 */

		 
		public boolean hasNext() {
			return currentPos < WeatherPrinterStyles.values().length;
		}

		/**
		 * The next() method check the next iterator on the list.
		 * @return current style value from the list of Weather Styles available 
		 */
		
		public WeatherPrinterStyles next() {
			return WeatherPrinterStyles.values()[currentPos++];
		}
		
		
	}
	
}
