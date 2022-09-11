/**
 * This class implements a car with an engine and 4 tires.
 * @author Eric Johnston
 * @version 1.0
 */
public class Car
{
	private Engine engine;
	private Tire tire1;
	private Tire tire2;
	private Tire tire3;
	private Tire tire4;

	/**
	 * Constructs a Car object by passing instances of an engine object and 4 tire objects
	 * @param engine object
	 * @param tire1 object
	 * @param tire2 object
	 * @param tire3 object
	 * @param tire4 object
	 */
	public Car(Engine engine, Tire tire1, Tire tire2, Tire tire3, Tire tire4)
	{
		this.engine = engine;
		this.tire1 = tire1;
		this.tire2 = tire2;
		this.tire3 = tire3;
		this.tire4 = tire4;
	}

	/**
	 * Accepts an integer and checks if speed is between 1 and 60. If so the car will drive.
	 * If not write to console that speed must be between 1 and 60.
	 * @param speed as an integer
	 */
	public void drive(int speed)
	{
		if (speed < 1 || speed > 60)
		{
			System.out.println("Car cannot drive at " + speed + "mph");
			System.out.println("The car must drive between 1 and 60 mph");
		}
		else
		{
			System.out.println("Car is driving at " + speed + "mph");
		}
	}
	
	/**
	 * Call the engine.start() method to start the car
	 */
	public void start()
	{
		engine.start(tire1.getPsi(), tire2.getPsi(), tire3.getPsi(), tire4.getPsi());
	}
	
	/**
	 * Call the engine.stop() method to stop the car.
	 */
	public void stop()
	{
		engine.stop();
	}

	/**
	 * Call first engine.stop(), then engine.start() to restart the car.
	 * Print to console that the car has restarted.
	 */
	public void restart()
	{
		System.out.println("Restarting car...");
		stop();
		start();
		System.out.println("Car restarted");
	}
	public static void main(String[] args)
	{
		// Create engine and tire objects. Note that tire 2 is created with 30 psi
		Engine engine = new Engine();
		Tire tire1 = new Tire(32);
		Tire tire2 = new Tire(30);
		Tire tire3 = new Tire(32);
		Tire tire4 = new Tire(32);
		
		Car car = new Car(engine, tire1, tire2, tire3, tire4);
		
		// First call of start() will fail because tire2 is at 30 psi
		car.start();
		// Set tire2 psi to 32 so engine can start
		car.tire2.setPsi(32);
		// Successful start
		car.start();
		
		// Drive the car
		car.drive(0);
		car.drive(30);
		car.drive(45);
		car.drive(60);
		car.drive(70);
		
		// Restart the car
		car.restart();
		// Stop the car
		car.stop();
	
	}
}
