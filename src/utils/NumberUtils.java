package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Helper class for rounding functions
 *
 * @author Roger Zaugg
 * @version 1.0
 *
 */
public class NumberUtils {

	/**
	 * Constant for 2 decimal places
	 */
	public static final int PLACES_2 = 2;

	/**
	 * Constant for 3 decimal places
	 */
	public static final int PLACES_3 = 3;

	/**
	 * Rounds the value to the specified number of decimal places
	 *
	 * @param value  value to be rounded
	 * @param places number of decimal places
	 * @return rounded value
	 *
	 * @see #PLACES_2
	 * @see #PLACES_3
	 */
	public static double round(double value, int places) {
		BigDecimal d = new BigDecimal(Double.toString(value));
		d = d.setScale(places, RoundingMode.HALF_UP);
		return d.doubleValue();
	}
}