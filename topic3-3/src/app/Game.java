package app;


/**
 * Implement game via main()
 * @author Eric Johnston
 * @version 1.0
 */
public class Game
{
	public static void main(String[] args)
	{
		Bomb weapon1 = new Bomb();
		Gun weapon2 = new Gun();
		weapon1.activate(true);
		weapon2.activate(true);
		weapon1.fireWeapon(10);
		weapon2.fireWeapon(5);
		weapon1.fireWeapn();
		weapon2.fireWeapon();
	}
}
