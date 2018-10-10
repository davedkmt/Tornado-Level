package edu.westga.cs6311.storm.tests;

import edu.westga.cs6311.storm.model.Tornado;

/**
 * This class is used to informally test the Tornado object
 * 
 * Original file created by CS6311 (you'll list your name with the appropriate
 * Javadoc tag below:
 * 
 * @author Dawit Tadesse
 * @version 08 October 2018
 *
 */
public class TornadoTester {
	private Tornado intensityOfEF1;
	private Tornado intensityOfEF2;
	private Tornado intensityOfEF4;
	private Tornado intensityOfEF5;

	/**
	 * Creates a new TornadoTester object and creates tester objects
	 * 
	 * @precondition None
	 */
	public TornadoTester() {
		this.intensityOfEF1 = new Tornado(100);
		this.intensityOfEF2 = new Tornado(111);
		this.intensityOfEF4 = new Tornado(200);
		this.intensityOfEF5 = new Tornado(201);
	}

	/**
	 * This method is used to execute the different sets of test code
	 * 
	 * @precondition None
	 */
	public void runTests() {
		this.shouldCreateTornadoesWithCorrectSpeeds();
		this.intensityShouldBeEF1ForIntensityOfEF1();
		this.shouldLowerWindSpeedBy5();
		this.intensityOfEF4ShouldBeSevere();
		this.intensityOfEF2ShouldNotBeSevere();
		this.intensityOfEF5ShouldBeStrongerThanIntensityOfEF2();
	}

	private void shouldCreateTornadoesWithCorrectSpeeds() {
		System.out.println("Tornado 1");
		System.out.println("Expected wind spped: " + "100");
		System.out.println("Actual wind spped:: " + this.intensityOfEF1.getWindSpeed());
		System.out.println("\n");

		System.out.println("Tornado 2");
		System.out.println("Expected wind spped: " + "111");
		System.out.println("Actual wind spped: " + this.intensityOfEF2.getWindSpeed());
		System.out.println("\n");

		System.out.println("Tornado 4");
		System.out.println("Expected wind spped: " + "200");
		System.out.println("Actual wind spped: " + this.intensityOfEF4.getWindSpeed());
		System.out.println("\n");

		System.out.println("Tornado 5");
		System.out.println("Expected wind spped: " + "201");
		System.out.println("Actual wind spped: " + this.intensityOfEF5.getWindSpeed());
		System.out.println("\n");
	}

	private void intensityShouldBeEF1ForIntensityOfEF1() {
		System.out.println(this.intensityOfEF1.getIntensity());
	}

	private void shouldLowerWindSpeedBy5() {
		System.out.println("Expected wind spped: " + "95");
		System.out.println("Actual wind spped: " + (this.intensityOfEF1.getWindSpeed() - 5));
		System.out.println("\n");
	}

	private void intensityOfEF4ShouldBeSevere() {

		System.out.println("Is intensity of EF4, speed of 200 severe ?");
		System.out.println("Expected: " + true);
		System.out.println("Actual: " + this.intensityOfEF4.isSevere());
		System.out.println("\n");
	}

	private void intensityOfEF2ShouldNotBeSevere() {
		System.out.println("Is intensity of EF2, speed of 111 severe ?");
		System.out.println("Expected: " + false);
		System.out.println("Actual: " + this.intensityOfEF2.isSevere());
		System.out.println("\n");
	}

	private void intensityOfEF5ShouldBeStrongerThanIntensityOfEF2() {
		System.out.println("Is intensity of EF5, speed of 201 stronger than intensity of EF2, speed of 111 ?");
		System.out.println("Expected: " + true);
		System.out.println("Actual: " + this.intensityOfEF5.isStrongerThan(this.intensityOfEF2));
		System.out.println("\n");
	}
}
