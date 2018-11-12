/**
 * This package contains the implementation of Singleton pattern
 * with static member as instance which contains the instance of the
 * Singleton class, private constructor LazyHTTPConnectionRegistry which 
 * prevent anybody to instantiate the Singleton class and a static public 
 * method getInstance() which provides the global point of access to the
 * Singleton object and returns the instance to the client calling class.
 * When this class is called from the client side using 
 * LazyHTTPConnectionRegistry getInstance() then at first time only it will
 * create an instance. And going forward for all subsequent calls we will be 
 * referring to the same object and getInstance() method returns the same 
 * instance of LazyHTTPConnectionRegistry class which was created first time.
 * We are using the Singleton pattern here as it is controlling the concurrent 
 * access to a shared resource. Here Weather API is shared by the entire 
 * application and it would be destructive to have potentially multiple
 * instances of same class.
 * 
 */

package edu.cs505.finalproject.group4.patterns.singleton.httpconnectionsingleton;