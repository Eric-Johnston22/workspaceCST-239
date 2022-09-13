package app;
import java.util.Random;

public class Game
{

	public static void main(String[] args)
	{
		// Create a random health between 1 and 100
		Random rand = new Random();
		int health1 = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
		int health2 = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
		
		// Create Superman and Batman
		System.out.println("Creating our Super Heroes...");
		Superman superman = new Superman(health1);
		Batman batman = new Batman(health2);
		System.out.println("Super Heroes Created!");
		
		// Run the game until one of the Super Heroes is dead
		System.out.println("Running our game...");
		while(!superman.isDead() && !batman.isDead())
		{
			superman.attack(batman);
			batman.attack(superman);
			
			if(superman.isDead())
			{
				System.out.println("Batman defeated Superman!");
			}
			if(batman.isDead())
			{
				System.out.println("Superman defeated Batman");
			}
		}
		
	}

}
