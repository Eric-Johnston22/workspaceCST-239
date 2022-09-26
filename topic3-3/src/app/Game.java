package app;
/**
 * Implement game via main()
 * @author Eric Johnston
 * @version 1.0
 */
public class Game
{
	/**
	 * Fires weapons
	 * @param weapon object
	 */
	private static void fireWeapon(WeaponInterface weapon)
	{
		if (weapon instanceof Bomb)
		{
			System.out.println("----------> I am a Bomb");
			weapon.activate(true);
			weapon.fireWeapon(5);
		}
		if (weapon instanceof Gun)
		{
			System.out.println("----------> I am a Gun");
			weapon.activate(true);
			weapon.fireWeapon(5);
		}
		
	}
	
	public static void main(String[] args)
	{
		WeaponInterface[] weapons = new WeaponInterface[2];
		weapons[0] = new Bomb();
		weapons[1] = new Gun();
		
		// For all Weapons fire them
		for (int i = 0; i < weapons.length; i++)
		{
			fireWeapon(weapons[i]);
		}
	}
}
