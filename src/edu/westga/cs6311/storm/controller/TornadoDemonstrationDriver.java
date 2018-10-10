package edu.westga.cs6311.storm.controller;

/**
 * This class creates a interactive Tornado object and calls its method
 * 
 * @author Dawit Tadesse
 * @version 08 October 2018
 *
 */
public class TornadoDemonstrationDriver {

	/**
	 * Entry point of the application
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		InteractiveTornado tornado2 = new InteractiveTornado();
		tornado2.inputTornadoSpeed();
		tornado2.initializeTornado();
		tornado2.demonstrateTornado();

	}

}
