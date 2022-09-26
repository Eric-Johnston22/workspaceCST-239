package app;


/**
 * Implement a weapon interface with the intention of creating subclasses
 * @author Eric Johnston
 * @version 1.0
 */
public interface WeaponInterface
{
	/**
	 * Fires the weapon
	 * @param power int - define how powerful the weapon is
	 */
	public void fireWeapon(int power);
	
	/**
	 * Fires the weapon
	 */
	public void fireWeapon();
	
	/**
	 * Activate the weapon
	 * @param enable boolean
	 */
	public void activate(boolean enable);
}
