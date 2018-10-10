package edu.westga.cs6311.storm.model;

/**
 * The Tornado class represents a tornado by keeping track of its estimated wind
 * speed. This class can accept speed modifications, however a speed may never
 * be higher may never be modified by more than 10 miles per hour one way or the
 * other. It can calculate the corresponding intensity based on the Enhanced
 * Fujita Scale: Wind Speed (mph) Intensity Scale < 65 Not a tornado 65 - 85 EF0
 * 86 - 110 EF1 111 - 135 EF2 136 - 165 EF3 166 - 200 EF4 > 200 EF5
 * 
 * It can also determine if a tornado is severe (must be an EF3 or above) and
 * whether this tornado has a higher intensity than another Tornado based on the
 * wind speed.
 * 
 * Original file created by CS6311 (you'll list your name with the appropriate
 * Javadoc tag below:
 * 
 * @author	Dawit Tadesse
 * @version 08 October 2018
 *
 */
public class Tornado {
	private static final int EF0_CUTOFF = 65;
	private static final int EF1_CUTOFF = 86;
	private static final int EF2_CUTOFF = 111;
	private static final int EF3_CUTOFF = 136;
	private static final int EF4_CUTOFF = 166;
	private static final int EF5_CUTOFF = 200;

	private int windSpeed;

	/**
	 * Creates a new Tornado object with the given wind speed
	 * 
	 * @param windSpeed The estimated wind speed value
	 * 
	 * @precondition windSpeed >= 0
	 */
	public Tornado(int windSpeed) {
		if (windSpeed < 0) {
			windSpeed = 0;
		}
		this.windSpeed = windSpeed;
	}

	/**
	 * Returns the wind speed value
	 * 
	 * @precondition None
	 * @return The estimated wind speed
	 */
	public int getWindSpeed() {
		return this.windSpeed;
	}

	/**
	 * Modifies the wind speed estimate by adding the specified number of miles per
	 * hour to the object.
	 * 
	 * @param modificationAmount The amount to modify the wind speed by
	 * 
	 * @precondition -10 <= modificationAmount <= 10
	 */
	public void modifySpeed(int modificationAmount) {
		if (modificationAmount < -10) {
			modificationAmount = 0;
		} else if (modificationAmount > 10) {
			modificationAmount = 0;
		}
		this.windSpeed = this.windSpeed + modificationAmount;
		
	}

	/**
	 * Returns true if the wind speed is greater than or equal to an EF3, and false
	 * otherwise
	 * 
	 * @precondition None
	 * @return true if and only if getWindSpeed() >= an EF3 minimum wind speed
	 */
	public boolean isSevere() {
		return (this.getWindSpeed() >= Tornado.EF3_CUTOFF);
	}

	/**
	 * Returns the intensity value as determined by the Enhanced Fujita Scale
	 * 
	 * @precondition: None
	 * @return Not a tornado if < 65, EF0 if 65-85, EF1 if 86-110, EF2 if 111-135,
	 *         EF3 if 136-165, EF4 if 166-200, EF5 otherwise
	 */
	public String getIntensity() {
		String enhancedFujitaScale;

		if (this.getWindSpeed() < Tornado.EF0_CUTOFF) {
			enhancedFujitaScale = "Not a tornado";
		} else if (this.getWindSpeed() >= Tornado.EF0_CUTOFF && this.getWindSpeed() < Tornado.EF1_CUTOFF) {
			enhancedFujitaScale = "EF0";
		} else if (this.getWindSpeed() >= Tornado.EF1_CUTOFF && this.getWindSpeed() < Tornado.EF2_CUTOFF) {
			enhancedFujitaScale = "EF1";
		} else if (this.getWindSpeed() >= Tornado.EF2_CUTOFF && this.getWindSpeed() < Tornado.EF3_CUTOFF) {
			enhancedFujitaScale = "EF2";
		} else if (this.getWindSpeed() >= Tornado.EF3_CUTOFF && this.getWindSpeed() < Tornado.EF4_CUTOFF) {
			enhancedFujitaScale = "EF3";
		} else if (this.getWindSpeed() >= Tornado.EF4_CUTOFF && this.getWindSpeed() <= Tornado.EF5_CUTOFF) {
			enhancedFujitaScale = "EF4";
		} else {
			enhancedFujitaScale = "EF5";
		}
		
		return enhancedFujitaScale;
	}

	/**
	 * Returns true is this Tornado's wind speed is greater than the specified
	 * Tornado's wind speed, and false otherwise
	 * 
	 * @param anotherTornado The other Tornado object to be compared
	 * 
	 * @return true if and only if getWindSpeed() > anotherTornado.getWindSpeed()
	 */
	public boolean isStrongerThan(Tornado anotherTornado) {
		return (this.getWindSpeed() > anotherTornado.getWindSpeed());
	}

}
