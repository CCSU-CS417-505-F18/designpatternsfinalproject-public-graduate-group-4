/**
 * This package contains the implementation of Singleton pattern
 * with static member as instance which contains the instance of the
 * Singleton class, private constructor HTTPConnectionRegistry which 
 * prevent anybody to instantiate the Singleton class and a static public 
 * method getInstance() which provides the global point of access to the
 * Singleton object and returns the instance to the client calling class.
 * When this class is called from the client side using 
 * HTTPConnectionRegistry getInstance() then at first time only it will
 * create an instance. And going forward for all subsequent calls we will be 
 * referring to the same object and getInstance() method returns the same 
 * instance of HTTPConnectionRegistry class which was created first time.
 * We are using the Singleton pattern here as it is controlling the concurrent 
 * access to a shared resource. Here Weather API is shared by the entire 
 * application and it would be destructive to have potentially multiple
 * instances of same class.connectionProperties is an instance variable which 
 * will give the properties to form the URL. The properties are saved to the root
 * folder and then gets loaded. The getConnectionProperties() method is a getter 
 * method that returns the connection properties to form the URL 
 */

package edu.cs505.finalproject.group4.patterns.singleton.httpconnectionsingleton;