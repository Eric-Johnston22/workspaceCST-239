package app;

/**
 * Implements a child of SuperHero with a unique method (superpower)
 * @author Eric Johston
 * @version 1.0
 */
public class Batman extends SuperHero
{

	/**
	 * Constructor
	 * @param health
	 */
	public Batman(int health)
	{
		super("Batman", health);
	}

	/**
	 * Call the setHealth() and getHealth() methods to generate 1 hp after taking damage
	 */
	public void regenerateHealth()
	{
		// Regenerate 1 health
		setHealth(getHealth() + 1);
		System.out.println("Batman regains some health after a hit...");
	}
}
