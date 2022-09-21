package app;

/**
 * Implements a Person that can walk, run, and discern if running
 * @author Eric Johnston
 * @version 1.0
 */
public interface PersonInterface
{
	/**
	 * Print to console when called, sets running to false
	 */
	public void walk();
	
	/**
	 * Print to console when called, sets running to true
	 */
	public void run();
	
	/**
	 * Checks if running is true or false
	 * @return running
	 */
	public boolean isRunning();
}
