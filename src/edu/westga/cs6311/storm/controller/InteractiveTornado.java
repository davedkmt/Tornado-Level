package edu.westga.cs6311.storm.controller;

import java.util.Scanner;

import edu.westga.cs6311.storm.model.Tornado;

/**
 * The InteractiveTornado class represents a tornado using users input and
 * keeping track of its estimated wind speed.
 * 
 * @author Dawit Tadesse
 * @version 08 October 2018
 *
 */
public class InteractiveTornado {
	private Tornado tornadoType;
	private Scanner scan;
	private int numberType;

	/**
	 * Instantiate objects
	 * 
	 */
	public InteractiveTornado() {
		this.scan = new Scanner(System.in);
		this.tornadoType = null;
		this.numberType = 0;
	}

	/**
	 * This method is used to read users input
	 */
	public void inputTornadoSpeed() {
		System.out.print("Please input an integer/number: ");
		String inData = this.scan.nextLine();
		int userNumber = Integer.parseInt(inData);
		this.numberType = userNumber;
	}

	/**
	 * This method is used to create a Tornado object
	 */
	public void initializeTornado() {
		this.tornadoType = new Tornado(this.numberType);
	}

	/**
	 * This method is used to return a Tornado object
	 */
	public void demonstrateTornado() {
		System.out.println("Wind Speed: " + this.tornadoType.getWindSpeed());
		System.out.println("Is the Tornado severe (true/false): " + this.tornadoType.isSevere());
		System.out.println("Intensity: " + this.tornadoType.getIntensity());
	}

}
