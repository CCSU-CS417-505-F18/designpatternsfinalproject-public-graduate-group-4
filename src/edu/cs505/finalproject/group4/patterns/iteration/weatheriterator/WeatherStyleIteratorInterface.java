package edu.cs505.finalproject.group4.patterns.iteration.weatheriterator;

 
/**
 * The WeatherStyleIteratorInterface interface defines the functions that need to be 
 * implemented by a concrete iterator. The interface provides framework to get the next 
 * values and check if the iterator has reached the end of the list. WeatherStyleIteratorInterface
 * has a generic that allow type T which can be used to define the concrete implementation 
 * class to decide what to iterate on. 
 * 
 * @version 1.0
 */

public interface WeatherStyleIteratorInterface <T> {

	/**
	 * The hasNext() method should be implemented by the concrete iterator implementation. 
	 * @return boolean true if the iterator is not at the end of the list and false if the
	 * iterator is at the end of the list.
	 */
	
	boolean hasNext();
	
	/** 
	 * The next() method check the next iterator on the list.
	 * @return T the element at the current position of the iterator
	 */
	
	T next();
	
}