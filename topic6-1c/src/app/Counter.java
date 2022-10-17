package app;

/** 
 * Implements a Counter that holds counter variable
 * @author Eric Johnston
 * @version 1.0
 */
public class Counter
{
	static int count = 0;
	
	/**
	 * Increments counter synchronized.
	 */
	static synchronized void incremet()
	{
		count = count + 1;
	}
	
	/**
	 * count getter
	 * @return count
	 */
	static int getCount()
	{
		return count;
	}
}
