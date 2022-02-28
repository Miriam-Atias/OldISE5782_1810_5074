/**
 *
 */
package primitives;

import static primitives.Util.*;

/**
 * This class will serve all primitive classes based on three numbers
 *
 * @author Dan Zilberstein
 */
public class Double3 {
	private final double _d1;
	private final double _d2;
	private final double _d3;

	private static final Double3 ZERO = new Double3(0, 0, 0);

	/**
	 * Constructor to initialize Double3 based object with its three number values
	 *
	 * @param d1 first number value
	 * @param d2 second number value
	 * @param d3 third number value
	 */
	protected Double3(double d1, double d2, double d3) {
		_d1 = d1;
		_d2 = d2;
		_d3 = d3;
	}

	/**
	 * Zero triad (0,0,0)
	 */
	public static Double3 getZERO() {
		return ZERO;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Double3))
			return false;
		Double3 other = (Double3) obj;
		return isZero(get_d1() - other.get_d1()) && isZero(get_d2() - other.get_d2()) && isZero(get_d3() - other.get_d3());
	}

	@Override
	public int hashCode() {
		return (int) Math.round(get_d1() + get_d2() + get_d3());
	}

	@Override
	public String toString() {
		return "(" + get_d1() + "," + get_d2() + "," + get_d3() + ")";
	}

	/**
	 * Sum two floating point triads into a new triad where each couple of numbers
	 * is summarized
	 *
	 * @param rhs right handle side operand for addition
	 * @return result of add
	 */
	Double3 add(Double3 rhs) {
		return new Double3(get_d1() + rhs.get_d1(), get_d2() + rhs.get_d2(), get_d3() + rhs.get_d3());
	}

	/**
	 * Subtract two floating point triads into a new triad where each couple of
	 * numbers is subtracted
	 *
	 * @param rhs right handle side operand for addition
	 * @return result of add
	 */
	Double3 subtract(Double3 rhs) {
		return new Double3(get_d1() - rhs.get_d1(), get_d2() - rhs.get_d2(), get_d3() - rhs.get_d3());
	}

	/**
	 * Scale (multiply) floating point triad by a number into a new triad where each
	 * number is multiplied by the number
	 *
	 * @param rhs right handle side operand for scaling
	 * @return result of scale
	 */
	Double3 scale(double rhs) {
		return new Double3(get_d1() * rhs, get_d2() * rhs, get_d3() * rhs);
	}

	/**
	 * Reduce (divide) floating point triad by a number into a new triad where each
	 * number is divided by the number
	 *
	 * @param rhs right handle side operand for reducing
	 * @return result of scale
	 */
	Double3 reduce(double rhs) {
		return new Double3(get_d1() / rhs, get_d2() / rhs, get_d3() / rhs);
	}

	/**
	 * Product two floating point triads into a new triad where each couple of
	 * numbers is multiplied
	 *
	 * @param rhs right handle side operand for product
	 * @return result of product
	 */
	Double3 product(Double3 rhs) {
		return new Double3(get_d1() * rhs.get_d1(), get_d2() * rhs.get_d2(), get_d3() * rhs.get_d3());
	}

	public double get_d1() {
		return _d1;
	}

	public double get_d2() {
		return _d2;
	}

	public double get_d3() {
		return _d3;
	}
}