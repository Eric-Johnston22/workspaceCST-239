package app;

public class Batman extends SuperHero
{

	public Batman(int health)
	{
		super("Batman", health);
	}

	public void regenerateHealth()
	{
		// Regenerate 1 health
		setHealth(getHealth() + 1);
		System.out.println("Batman regains some health after a hit...");
	}
}
