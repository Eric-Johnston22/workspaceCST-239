package app;

/**
 * Implements a Bomb, extends from Weapon
 * @author Eric Johnston
 * @version 1.0
 */
public class Bomb extends Weapon
{
	@Override
	/**
	 * 
	 */
	public void fireWeapon(int power)
	{
		System.out.println("In Bomb.fireWeapon() with a power of " + power);
	}
	
	/**
	 * Overloaded - Fires the weapon and calls fireWeapon from parent class
	 */
	public void fireWeapn()
	{
		System.out.println("In overloaded Bomb.fireWeapon()");
		super.fireWeapon(10);
	}
	
	/**
	 * 
	 */
	public void activate(boolean enable)
	{
		System.out.println("In the Bomb.activate() with an enable of " + enable);
	}
}
