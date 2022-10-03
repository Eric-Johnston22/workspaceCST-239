package app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Implements a class that creates a JSON file and reads its contents to the console.
 * @author Eric Johnston
 * @version 1.0
 */
public class DemoJsonFiles
{
	public static void saveToFile(String filename, Car car, boolean append)
	{
		PrintWriter pw;
		
		try
		{
			//Create a file File to write
			File file = new File(filename);
			FileWriter fw = new FileWriter(file, append);
			pw = new PrintWriter(fw);
			
			//Write Car is JSON
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(car);
			pw.println(json);
			
			pw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private static ArrayList<Car> readFromFile(String filename)
	{
		ArrayList<Car> cars = new ArrayList<Car>();
		
		try
		{
			// Open the file File to read
			File file = new File(filename);
			Scanner s = new Scanner(file);
			
			while(s.hasNext())
			{
				String json = s.nextLine();
				ObjectMapper objectMapper = new ObjectMapper();
				Car car = objectMapper.readValue(json, Car.class);
				cars.add(car);
			}
			
			s.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return cars;
	}
	
	public static void main(String[] args) throws IOException
	{
		Car[] cars = new Car[5];
		cars[0] = new Car(2018, "Ford", "Mustang", 0, 1.5d);
		cars[1] = new Car(2018, "Chevy", "Blazer", 1000, 1.5d);
		cars[2] = new Car(2019, "Toyota", "Camery", 2000, 1.5d);
		cars[3] = new Car(2018, "Toyota", "Avalon", 90000, 2.5d);
		cars[4] = new Car(2010, "GMC", "Silverado", 10000, 3.5d);
		
		for (int i = 0; i <= 4; i++)
		{
			saveToFile("out.json", cars[i], true);
		}
		
		ArrayList<Car> carsList = readFromFile("out.json");
		for (Car car : carsList)
		{
			String text = Integer.toString(car.getYear()) + "," +
					car.getMake() + "," + car.getModel() + "," +
					Integer.toString(car.getOdometer()) + "," +
					Double.toString(car.getEngineLiters());
			
			System.out.println(text);
		}
	}
}



