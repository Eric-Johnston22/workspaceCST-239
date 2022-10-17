package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Implements a Client that connects to Server
 * @author Eric Johnston
 * @version 1.0
 */
public class Client
{
	private Socket  clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	
	/**
	 * Starts client connection
	 * @param ip
	 * @param port
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public void start(String ip, int port) throws UnknownHostException, IOException
	{
		clientSocket = new Socket(ip, port);
		
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	}

	/**
	 * Sends message as a string
	 * @param msg
	 * @return string
	 * @throws IOException
	 */
	public String sendMessage(String msg) throws IOException
	{
		out.println(msg);
		
		return in.readLine();
	}
	
	/**
	 * Close I/O and socket
	 * @throws IOException
	 */
	public void cleanup() throws IOException
	{
		in.close();
		out.close();
		clientSocket.close();
	}
	
	public static void main(String[] args) throws IOException
	{
		Client client = new Client();
		client.start("127.0.0.1", 6666);
		
		String response;
		for (int count = 0; count < 10; count++)
		{
			String message;
			if(count != 9)
			{
				message = "Hello from client " + count;
			}
			else
			{
				message = ".";
			}
			response = client.sendMessage(message);
			
			System.out.println("Server response was " + response);
			if (response.equals("q"))
			{
				break;
			}
		}
		client.cleanup();
	}

}
