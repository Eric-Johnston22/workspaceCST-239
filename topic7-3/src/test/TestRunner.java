package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Holds main to test assertions
 * @author Eric Johnston
 * @version 1.0
 */
public class TestRunner
{
	public static void main(String[] args)
	{
		Result result = JUnitCore.runClasses(TestAssertions.class);
		for (Failure failure : result.getFailures())
		{
			System.out.println("A JUnit test failed: " + failure.toString());
		}
		
		System.out.println("The JUnit tests " + (result.wasSuccessful() ? "Passed" : "Failed"));

	}
}
