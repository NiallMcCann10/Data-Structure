package ie.gmit.sw;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Processor {
	
	private Deque<Character> deque = new ArrayDeque<>();
	private PrintWriter fw = new PrintWriter("out.txt");
	private FourSquareCipher c = new FourSquareCipher();
	
	public Processor (String line, boolean encrypt) throws IOException
	{
		process(line);
		writeBigrams(encrypt);
		fw.close();
	}
	
	public void process(String line)
	{
		int i;
		
		for(i = 0; i < line.length(); i++)
		{
			deque.addLast((line.charAt(i)));
		}
	}
	
	private void writeBigrams(boolean encrypt) throws IOException
	{
		while(deque.size() >=2)
		{
			char s = deque.poll();
			char t = deque.poll();
			
			String bigram = encrypt ? c.encrypt(s,t) : c.decrypt(s,t);
			
			fw.write(bigram);
		}
	}

}
