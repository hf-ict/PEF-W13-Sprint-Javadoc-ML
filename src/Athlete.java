import utils.NumberUtils;

import java.util.Random;

/**
 * Represents an athlete
 * @author Roger Zaugg
 * @version 1.0
 */
public class Athlete {

	private String name;
	private double time;

	/**
	 * Creates a new instance for an athlete
	 * @param name Name of the athlete
	 */
	public Athlete(String name) {
		this.name = name;
	}

	/**
	 * Returns the name of the athlete
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the time the athlete ran
	 * @return time
	 * @see #run()
	 */
	public double getTime() {
		return time;
	}

	/**
	 * Generates a random time between 8 and 12 seconds
	 * and stores it in time, rounded to 2 decimal places
	 * @see NumberUtils#round(double, int)
	 */
	public void run() {
		Random random = new Random();
		this.time = NumberUtils.round((random.nextDouble() * 4) + 8, NumberUtils.PLACES_2);
	}
}