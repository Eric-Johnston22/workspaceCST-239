package app;
import java.util.Random;

/**
 * Implements a superhero with a name, health, and isDead field. Also holds methods for the game to function
 * @author Eric Johnston
 * @version 1.0
 */
public class SuperHero
{
	private String name;
	private int health;
	private boolean isDead;
	
	/**
	 * Constructor
	 * @param name
	 * @param health
	 */
	public SuperHero(String name, int health)
	{
		this.name = name;
		this.health = health;
	}
	
	/**
	 * Health getter
	 * @return
	 */
	public int getHealth()
	{
		return health;
	}
	
	/**
	 * Health setter
	 * @param health
	 */
	public void setHealth(int health)
	{
		this.health = health;
	}


	/**
	 * Attack method generates a random number to assign to damage.
	 * Calls the determineHealth() method and passes damage
	 * @param opponent SuperHero object
	 */
	public void attack(SuperHero opponent)
	{
		Random rand = new Random();
		int damage = rand.ints(1, (10 + 1)).findFirst().getAsInt();
		
		opponent.determineHealth(damage);
		System.out.println(String.format("%s has damage of %d and health of %d", opponent.name, damage, opponent.health));
	}
	
	/**
	 * Determine if hero is dead
	 * @return true or false
	 */
	public boolean isDead()
	{
		return this.isDead;
	}
	
	/**
	 * Determine the health of this superhero
	 * @param damage done to hero
	 */
	private void determineHealth(int damage)
	{
		if(this.health - damage <= 0)
		{
			this.health = 0;
			this.isDead = true;
		}
		else
		{
			this.health = this.health - damage;
		}
	}
}
