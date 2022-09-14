package app;

public class Superman extends SuperHero
{

	public Superman(int health)
	{
		super("Superman", health);
	}
	
	public void superStrength(SuperHero opponent)
	{
		// Superman is stronger than Batman and thus gets 2 attacks
		attack(opponent);
		System.out.println("Superman packs a more powerful punch...");
	}

}
