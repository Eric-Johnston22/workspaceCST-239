package junit;

/**
 * Implements a calculator
 * @author Eric Johnston
 * @version 1.0
 */
public class Calculator
{
	/**
	 * Adds two integers
	 * @param a
	 * @param b
	 * @return sum
	 */
	public int add(int a, int b)
	{
		return a + b;
	}
	
	/**
	 * Subtracts two integers
	 * @param a
	 * @param b
	 * @return difference
	 */
	public int subtract(int a, int b)
	{
		return a - b;
	}
	
	/**
	 * Multiplies two integers
	 * @param a
	 * @param b
	 * @return product
	 */
	public int multiply(int a, int b)
	{
		return a * b;
	}
	
	/**
	 * Divides two integers
	 * @param a
	 * @param b
	 * @return quotient
	 */
	public int divide(int a, int b)
	{
		return a / b;
	}
	

	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		System.out.println("Adding 1 + 2 is " + calc.add(1, 2));
		System.out.println("Subtracting 2 from 1 is " + calc.subtract(1, 2));
		System.out.println("Multiplaction of 10 and 2 is " + calc.multiply(10, 2));
		System.out.println("Division of 10 by 2 is " + calc.divide(10, 2));
	}

}
