package edu.cs505.finalproject.group4;

import java.io.IOException;

import edu.cs505.smarthome.group4.*;
/**
 * RoomTemperatureComponent is an interface with a getRoomTemperature() method 
 * which returns the room temperature from the temperature Sensor
 * IOException handles the situation such as providing invalid directory name
 * file which captures the sensor is not available, providing the invalid path.
 * Interrupted Exception to handle the thread waiting or sleeping.  
 */
public interface RoomTemperatureComponent {
	
	/**
	 * Gets the room temperature.
	 *
	 * @return Room temperature, which is a model class and is used for getting the room temperature from the Temperature Sensor by providing the path for the file that stores the temperature.
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws InterruptedException the interrupted exception
	 */
	public RoomTemperature getRoomTemperature() throws IOException, InterruptedException;

}