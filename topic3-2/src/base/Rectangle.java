package base;

/**
 * Implements a rectangle
 * @author Eric Johnston
 * @version 1.0
 */
public class Rectangle extends ShapeBase
{
	public Rectangle(String name, int width, int height)
	{
		super(name, width, height);
	}
 
	@Override
	public int calculateArea()
	{
		return width * height;
	}
}
