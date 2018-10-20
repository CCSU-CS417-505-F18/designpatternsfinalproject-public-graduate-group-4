                            CS 505: Design Patterns Final Project

                                    Topic: SmartHome
                 By: Sudha Bopini, Aditi Sharma, Neelima Ganti, Surabhi Agnihotri

1.    Main Idea: For the final project, we are working on SmartHome - DoorLock functionality using different Design Patterns. Smart door locks offer access control feature to our home, perform auto lock and auto unlock. Using a Raspberry Pi and Camera, user can remotely unlock a door. The build will be attached to our existing lock and notify when the door has been unlocked. The camera sends the picture on the display monitor, and user unlocks the door.

2.    Shared component Functionality: 
2.1  Weather Implementation: We are including the weather data to our display monitor. For weather data we will be using weather API to communicate with the sensor and the Raspberry Pi. The weather station displays the weather information such as temperature, humidity and successive weather forecasts. The Weather Stations continually monitor the weather and then send their data to an Oracle database, where it is stored and can be accessed.
2.2  Temperature Control: We are checking the room temperature and controlling Air Conditioning or heating based on the user’s room temperature.
2.3  Light ON/Light OFF: Turning on the light when you are at home and turning of the room lights when you are stepping out/or when there is enough sunlight using the sunrise and sunset parameters from the weather implementation. 

3.    Implementation Details: 

3.1 Weather Implementation:
Finding the weather Data: There are multiple weather datas that are available online for fetching the data. We are using the OpenWeatherMap(https://openweathermap.org/) for our project. The first step is to create an account on the OpenWeatherMap API and generate an API key,(API is a code passed in by computer programs calling an application programming interface (API) to identify the calling program, its developer, or its user to the Web site. API keys are used to track and control how the API is being used). For instance, the API key used for our implementation a3eb81a3fb976abdc5ac6350e116e914.

Fetching the weather: Now that we have our weather data set up, we can call the current weather data for a location by city name, by cityID, by geographic coordinates and by zip code. We are fetching the weather using zip code.

Java Program for Shared component: 
Interface: We are creating an interface called WeatherComponent. 
Method: getCurrentWeatherByZipCode 
Parameter: String zipCode 
ReturnType: CurrentWeather 
CurrentWeather is a model class and contains the object for Temperature, Humidity, Rainfall, Sunrise and Sunset.
ExceptionHandled: We are using IOException to handle the situation such as IP address of the host could not be determined, invalid URL, when the API is not responding. Forecast Exception to handle the situation when there is no valid forecast. 

3.2 Light On/Light OFF: Now that we have our WeatherData, we will use sunrise and sunset class to control the light for our SmartHome. 
•    If time >= sunset, then turn on the light.
•    If time >= sunrise, then turn off the light.

3.3 Room Temperature Control:
After connecting sensor and setting up the configuration, we need to get the directory for the sensor and the file which captures the sensor. After fetching the file name and directory name, we can provide the information into Java Program.
Java Program for Shared component: 
Interface: We are creating an interface called RoomTemperatureComponent. 
Method: getRoomTemperature 
ReturnType: RoomTemperature 
RoomTemperature is a model class and is used for getting the room temperature from the Temperature Sensor by providing the path for the file that stores the temperature. 
ExceptionHandled: We are using IOException to handle the situation such as providing invalid directory name, file which captures the sensor is not available, providing the invalid path. Interrupted Exception to handle the thread waiting or sleeping.  



