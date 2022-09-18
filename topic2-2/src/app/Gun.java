package app;

/**
 * Implements a gun, extends from Weapon
 * @author Eric Johnston
 * @version 1.0
 *
 */
public class Gun extends Weapon
{
	@Override
	/**
	 * 
	 */
	public void fireWeapon(int power)
	{
		System.out.println("In Gun.fireWeapon() with a power of " + power);
	}
	
	/**
	 * Overloaded - Fires the weapon and calls fireWeapon from parent class
	 */
	public void fireWeapon()
	{
		System.out.println("In overloaded Gun.fireWeapon()");
		super.fireWeapon(5);
	}
	
	/**
	 * 
	 */
	public void activate(boolean enable)
	{
		System.out.println("In the Gun.activate() with an enable of " + enable);
	}
}
