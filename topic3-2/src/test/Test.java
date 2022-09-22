package test;

import base.ShapeBase;
import base.Rectangle;
import base.Triangle;

public class Test
{
	private static void displayArea(ShapeBase shape)
	{
		System.out.println("This is a shape named " + shape.getName() + " with an area of " + shape.calculateArea());
	}
	
	public static void main(String[] args)
	{
		// Create an array of Base Shapes and initialize to specific Shapes
		ShapeBase[] shapes = new ShapeBase[2];
		shapes[0] = new Rectangle("Rectangle", 10, 200);
		shapes[1] = new Triangle("Triangle", 10, 50);
		
		// For all Shapes display its area
		for (int x = 0; x < shapes.length; x++)
		{
			displayArea(shapes[x]);
		}
		
	}
}
