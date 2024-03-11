package filepractise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CPY {

	public static void main(String[] args) {

		File ff = new File("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\newhc\\cfile1.txt");
		
		try
		{
		if(ff.createNewFile())
		{
			System.out.println("created ff");
		}
		
		else
		{
			System.out.println("already existss");
		}
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			
			
		FileReader fr = new FileReader("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\newhc\\cfile.txt");
		
		FileWriter fw = new FileWriter("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\newhc\\cfile1.txt");

		try
		{
			int i;
			
			while((i = fr.read()) != -1)
			{
				fw.write((char)i);
			}
		}
		
		finally
		{
			fr.close();
			fw.close();
		}
		
		
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
