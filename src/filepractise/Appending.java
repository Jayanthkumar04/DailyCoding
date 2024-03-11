package filepractise;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Appending {

	public static void main(String[] args) throws Exception{

		String str = "i am new";

		try
		{
		FileWriter fw = new FileWriter("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\newhc\\cfile1.txt");	
		BufferedWriter bw = new BufferedWriter(fw);
	
		
		
		bw.write(str);
	
		bw.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
	}

}
