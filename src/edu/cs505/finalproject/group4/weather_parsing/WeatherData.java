package edu.cs505.finalproject.group4.weather_parsing;

public class WeatherData {

	private float Humidity;
	private float MinTemp;
	private float MaxTemp;
	private float AvgTemp;


	WeatherData(){
		Humidity = 0;
		MinTemp = 0;
		MaxTemp = 0;
		AvgTemp = 0;
	}


	public float getHumidity() {
		return Humidity;
	}


	public void setHumidity(float humidity) {
		Humidity = humidity;
	}


	public float getMinTemp() {
		return MinTemp;
	}


	public void setMinTemp(float minTemp) {
		MinTemp = minTemp;
	}


	public float getMaxTemp() {
		return MaxTemp;
	}


	public void setMaxTemp(float maxTemp) {
		MaxTemp = maxTemp;
	}


	public float getAvgTemp() {
		return AvgTemp;
	}


	public void setAvgTemp(float avgTemp) {
		AvgTemp = avgTemp;
	}


	public void printWeatherData()
	{
		System.out.println("Avg Temperature : " + AvgTemp);
		System.out.println("Min Temperature : " + MinTemp);
		System.out.println("Max Temperature : " + MaxTemp);
		System.out.println("Humidity        : " + Humidity + " %");

	}


}
