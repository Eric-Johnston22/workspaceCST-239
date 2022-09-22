package base;

/**
 * Implements a circle with a radius
 * @author Eric Johnston
 * @version 1.0
 */
public class Circle extends ShapeBase
{
	private int radius;
	
	public Circle(String name, int width, int height, int radius)
	{
		super(name, width, height);
		this.radius = radius;
	}
	
	public int calculateArea()
	{
		return (int) (3.14 * Math.pow(radius, 2));
	}
}
