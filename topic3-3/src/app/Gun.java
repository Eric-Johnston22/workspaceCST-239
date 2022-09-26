package app;


/**
 * Implements a gun, extends from Weapon
 * @author Eric Johnston
 * @version 1.0
 *
 */
public class Gun implements WeaponInterface
{
	@Override
	public void fireWeapon(int power)
	{
		System.out.println("In Gun.fireWeapon() with a power of " + power);
	}
	
	@Override
	public void fireWeapon()
	{
		System.out.println("In Gun.fireWeapon()");
	}
	
	@Override
	public void activate(boolean enable)
	{
		System.out.println("In the Gun.activate() with an enable of " + enable);
	}
}
