package app;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Implements a FilePlay class that reads a file, then outputs its contents to a new file.
 * @author Eric Johnston
 * @version 1.0
 */
public class FilePlay
{

	/**
	 * Reads a file then outputs its contents to a new file.
	 * @param inputFile
	 * @param outputFile
	 * @return int for error codes
	 */
	private static int copyFile(String inputFile, String outputFile)
	{
		// Input and Output File Read/Write declarations
		BufferedReader in = null;
		BufferedWriter out = null;

		try 
		{
			// Create reader and writer
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));

			int c;
			while ((c = in.read()) != -1) 
			{
				out.write(c);
			}
			in.close();
			out.close();
			return 0;
		} 
		catch (FileNotFoundException ex) 
		{
			ex.printStackTrace();
			return -1;
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
			return -2;
		}
}
	
	public static void main(String[] args)
	{
		int err = copyFile("InUsers.txt", "OutUsers.txt");

		switch(err)
		{
			case 0:
				System.out.println("File was copied successfully");
			break;
			
			case -1:
				System.out.println("File could not be opened");
			break;
			
			case -2:
				System.out.println("File I/O error");
			break;
		}
		
	}

}
