package ie.gmit.sw;
import java.io.*;

public class Parser {
	public void parser(String res, boolean unit) throws IOException 
	{
	BufferedReader br = new BufferedReader (new FileReader(res));
	String line = null;
	
	try {
		while((line = br.readLine()) !=null) {
			line = line.toUpperCase().replaceAll("[^A-Z]","").replaceAll("J", "I");
			new Processor(line, unit);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	br.close();
	}

}
