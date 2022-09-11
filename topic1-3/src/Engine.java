/**
 * Implements an Engine object
 * @author Eric Johnston
 * @version 1.0
 */
public class Engine
{
	
	/**
	 * Check that tires are at or above 32 psi before starting the engine.
	 * @param tire1 int - Represents PSI
	 * @param tire2 int - Represents PSI
	 * @param tire3 int - Represents PSI
	 * @param tire4 int - Represents PSI
	 */
	public void start(int tire1, int tire2, int tire3, int tire4)
	{
		System.out.println("Checking that all tires have at least 32 PSI...");
		if(tire1 < 32)
		{
			System.out.println("Tire 1 is at " + tire1 + " PSI. Cannot start engine.");
			return;
		}
		if(tire2 < 32)
		{
			System.out.println("Tire 2 is at " + tire2 + " PSI. Cannot start engine.");
			return;
		}
		if(tire3 < 32)
		{
			System.out.println("Tire 3 is at " + tire3 + " PSI. Cannot start engine.");
			return;
		}
		if(tire4 < 32)
		{
			System.out.println("Tire 4 is at " + tire4 + " PSI. Cannot start engine.");
			return;
		}
		else
		{
			System.out.println("Engine started");
		}
	}
	
	/**
	 * Print to console that the engine has stopped.
	 */
	public void stop()
	{
		System.out.println("Engine stopped");
	}
}
