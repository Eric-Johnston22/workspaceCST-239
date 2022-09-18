package app;

/**
 * Implement a weapon class with the intention of creating subclasses
 * @author Eric Johnston
 * @version 1.0
 */
public abstract class Weapon
{
	/**
	 * Fires the weapon
	 * @param power int - define how powerful the weapon is
	 */
	public void fireWeapon(int power)
	{
		System.out.println("In Weapon.fireWeapon() with a power of " + power);
	}
	
	/**
	 * Activate the weapon
	 * @param enable boolean
	 */
	public abstract void activate(boolean enable);
}
