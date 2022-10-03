package testing;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test
{
	public class Car 
	{
	    private String brand = null;
	    private int doors = 0;

	    public String getBrand() { return this.brand; }
	    public void   setBrand(String brand){ this.brand = brand;}

	    public int  getDoors() { return this.doors; }
	    public void setDoors (int doors) { this.doors = doors; }
	}
	
	public static void main(String[] args)
	{
		ObjectMapper objectMapper = new ObjectMapper();

		String carJson =
		    "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

		try {
		    Car car = objectMapper.readValue(carJson, Car.class);

		    System.out.println("car brand = " + car.getBrand());
		    System.out.println("car doors = " + car.getDoors());
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
}