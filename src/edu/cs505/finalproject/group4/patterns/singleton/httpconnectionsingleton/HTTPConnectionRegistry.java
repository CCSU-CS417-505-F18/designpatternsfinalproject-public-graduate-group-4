package edu.cs505.finalproject.group4.patterns.singleton.httpconnectionsingleton;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/**
 * The HTTPConnectionRegistry class is a Singleton Class which allows to 
 * create one instance of the class. Using inner class type of Singleton class, 
 * lazy invocation is done. This class will have the httpMakeGETRequest method to
 * get the response from API after checking the errors/failures.
 * HTTPConnectionRegistry is the private constructor of Singleton class.
 * 
 * @version 1.0
 */
public class HTTPConnectionRegistry 
{
	Properties connectionProperties;
	private static HTTPConnectionRegistry instance = new HTTPConnectionRegistry();
	
	private HTTPConnectionRegistry() 
	{
		System.out.println("Creating Connection Registry singleton");
		connectionProperties = new Properties();
		InputStream input = null;
		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("config.properties");

			/*set the properties value 
			 */
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "mkyong");
			prop.setProperty("dbpassword", "password");

			/*save properties to project root folder
			*/
			prop.store(output, null);
			
			output.close();

			
			
			input = new FileInputStream("appconfig.properties");

			/*load a properties file
			 */
			connectionProperties.load(input);
			System.out.println(connectionProperties);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/*
	 * getter method that Returns the Connection properties to form the URL 
	 */
	public Properties getConnectionProperties(){
		return connectionProperties;
	}

	/**
	 * HTTPConnectionRegistry is the private constructor of Singleton class 
	 * which has getInstance() method.
	 * 
	 * @return Instance the object of the Singleton class.
	 */

	public static HTTPConnectionRegistry getInstance() 
	{
		if(instance == null)
		{
			instance = new HTTPConnectionRegistry();

		}
		return instance;
	}
	
	/**
	 * The httpMakeGETRequest() method will make the API request. 
	 * 
	 * @param requestAddress It takes Web URL as input and invokes the API call by 
	 * using the URL as endpoint
	 * @return response API response after validation of return for HTTP. Return code 200
	 * @return null if the connection is failed, we get the Error and Bad Response.
	 * @throws IOException 
	 */
	
	public String httpMakeGETRequest(String weatherProviderURL) throws IOException 
	{
		HttpURLConnection connection = null;
		URL request;
		BufferedReader reader = null;
		String lines = null;
		String response = null;
		request = new URL(weatherProviderURL);
		connection = (HttpURLConnection) request.openConnection();
		connection.setRequestMethod("GET");
		connection.setUseCaches(false);
		connection.setDoInput(true);
		connection.setDoOutput(false);
		connection.setRequestProperty("Accept-Encoding", "gzip, deflate");

		try
		{
			connection.connect();

			if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) 
			{
				String encoding = connection.getContentEncoding();

				try 
				{
					if (encoding != null && "gzip".equalsIgnoreCase(encoding)) 
					{
						reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(connection.getInputStream())));
					} else if (encoding != null && "deflate".equalsIgnoreCase(encoding))
					{
						reader = new BufferedReader(new InputStreamReader(new InflaterInputStream(connection.getInputStream(), new Inflater(true))));
					} else 
					{
						reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
					}

					while ((lines = reader.readLine()) != null) 
					{
						response = lines;
					}
				} catch (IOException e) 
				{
					System.err.println("Error: " + e.getMessage());
				} finally 
				{
					if (reader != null) 
					{
						try
						{
							reader.close();
						} catch (IOException e) 
						{
							System.err.println("Error: " + e.getMessage());
						}
					}
				}
			} else 
			{ 
				try 
				{
					reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
					while ((lines = reader.readLine()) != null) 
					{
						response = lines;
					}
				} catch (IOException e) 
				{
					System.err.println("Error: " + e.getMessage());
				} finally 
				{
					if (reader != null)
					{
						try
						{
							reader.close();
						} catch (IOException e) 
						{
							System.err.println("Error: " + e.getMessage());
						}
					}
				}

				System.err.println("Bad Response: " + response + "\n");
				return null;
			}
		} catch (IOException e) 
		{
			System.err.println("Error: " + e.getMessage());
			response = null;
		} finally 
		{
			if (connection != null)
			{
				connection.disconnect();
			}
		}

		return response;
	}

}

