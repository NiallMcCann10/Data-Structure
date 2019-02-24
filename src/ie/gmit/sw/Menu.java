package ie.gmit.sw;
import java.io.IOException;
import java.util.*;

public class Menu {
	
	boolean keepRunning = true;
	
	private Scanner s = new Scanner(System.in);
	
	private String text = "Select an option below";
	private long startTime;
	
	public void show() throws IOException
	{
		while(keepRunning)
		{
			System.out.println(text);
			System.out.println("1 Encrypt");
			System.out.println("2 Decrypt");
			System.out.println("3 Quit");
		
			String option = s.next();
			process(option);
		}
	}
	
	private void process(String option) throws IOException
	{
		int selection = Integer.parseInt(option);
		String fileName;
		
		if(selection ==1)
		{
			System.out.println("Please enter the file for encryption");
			fileName = s.next();
			startTime = System.nanoTime();
			new Parser().parser(fileName, true);
			System.out.println("\nRunning Time (ns): " + (System.nanoTime() - startTime));
			//encryptMenu();
		}
		else if(selection==2)
		{
			System.out.println("Please enter the file for decrytion");
			fileName = s.next();
			new Parser().parser(fileName, false);
			//decryptMenu()
		}
		else
		{
			keepRunning = false;
		}
		
	}
	

}
