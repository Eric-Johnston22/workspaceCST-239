package test;

import base.ShapeBase;
import base.Trapezoid;
import base.Circle;
import base.Rectangle;
import base.Triangle;

/**
 * Implement app via the main method
 * @author Eric Johnston
 * @version 1.0
 */
public class Test
{
	/**
	 * Prints to console shape name and area
	 * @param shape object
	 */
	private static void displayArea(ShapeBase shape)
	{
		System.out.println("This is a shape named " + shape.getName() + " with an area of " + shape.calculateArea());
	}
	
	public static void main(String[] args)
	{
		// Create an array of Base Shapes and initialize to specific Shapes
		ShapeBase[] shapes = new ShapeBase[4];
		shapes[0] = new Rectangle("Rectangle", 10, 200);
		shapes[1] = new Triangle("Triangle", 10, 50);
		shapes[2] = new Circle("Circle", 0, 0, 6);
		shapes[3] = new Trapezoid("Trapezoid", 0, 7, 8, 13);
		
		// For all Shapes display its area
		for (int x = 0; x < shapes.length; x++)
		{
			displayArea(shapes[x]);
		}
		
	}
}
