package app;

/**
 * Implements a child of SuperHero with a unique method (superpower)
 * @author Eric Johston
 * @version 1.0
 */
public class Superman extends SuperHero
{

	/**
	 * Constructor
	 * @param health
	 */
	public Superman(int health)
	{
		super("Superman", health);
	}
	
	public void superStrength(SuperHero opponent)
	{
		// Superman is stronger than Batman and thus gets 2 attacks
		System.out.println("Superman packs a more powerful punch...");
		attack(opponent);
	}

}
