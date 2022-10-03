package app;

/**
 * Implements a car with a year, make, model, odemeter, and engineLiters
 * @author Eric Johnston
 * @version 1.0
 */
public class Car
{
	private int year;
	private String make;
	private String model;
	private int odometer;
	private double engineLiters;
	
	/**
	 * Default constructor
	 */
	public Car()
	{
		year = 0;
		make = "";
		model = "";
		odometer = 0;
		engineLiters = 0;
	}
	
	/**
	 * Constructor
	 * @param year
	 * @param make
	 * @param model
	 * @param odometer
	 * @param engineLiters
	 */
	public Car (int year, String make, String model, int odometer, double engineLiters)
	{
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.odometer = odometer;
		this.engineLiters = engineLiters;
	}
	
	/**
	 * Year getter
	 * @return
	 */
	public int getYear()
	{
		return year;
	}

	/**
	 * Year setter
	 * @param year
	 */
	public void setYear(int year)
	{
		this.year = year;
	}

	/**
	 * Make getter
	 * @return
	 */
	public String getMake()
	{
		return make;
	}

	/**
	 * Make setter
	 * @param make
	 */
	public void setMake(String make)
	{
		this.make = make;
	}

	/**
	 * Model getter
	 * @return
	 */
	public String getModel()
	{
		return model;
	}

	/** 
	 * Model setter
	 * @param model
	 */
	public void setModel(String model)
	{
		this.model = model;
	}

	/**
	 * Odometer getter
	 * @return
	 */
	public int getOdometer()
	{
		return odometer;
	}

	/**
	 * Odometer setter
	 * @param odometer
	 */
	public void setOdometer(int odometer)
	{
		this.odometer = odometer;
	}

	/**
	 * engineLiters getter
	 * @return
	 */
	public double getEngineLiters()
	{
		return engineLiters;
	}

	/** 
	 * engineLiters setter
	 * @param engineLiters
	 */
	public void setEngineLiters(double engineLiters)
	{
		this.engineLiters = engineLiters;
	}
}
