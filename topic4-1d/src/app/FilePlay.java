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
	 */
	private static void copyFile(String inputFile, String outputFile) throws FileNotFoundException, IOException
	{
		// Input and Output File Read/Write declarations
		BufferedReader in = null;
		BufferedWriter out = null;

		
			// Create reader and writer
			in = new BufferedReader(new FileReader(inputFile));
			out = new BufferedWriter(new FileWriter(outputFile));

			String line;
			while ((line = in.readLine()) != null) 
			{
				String[] tokens = line.split("\\|");
				out.write(String.format("Name is %s %s of age %s\n", tokens[0], tokens[1], tokens[2]));
			}
			in.close();
			out.close();
}
	
	public static void main(String[] args)
	{

		try 
		{
			FilePlay.copyFile("InUsers.txt", "OutUsers.txt");
			System.out.println("File was copied successfully");
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("File could not be opened");
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("File I/O error.");
		}
		
	}

}
