package filepractise;

import java.io.FileReader;

public class FRead {

	public static void main(String[] args) {

		try
		{
		
		FileReader f = new FileReader("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\newhc\\cfile.txt");
		
		try
		{
			int i;
			
			while((i = f.read()) != -1)
			{
				System.out.print((char)i);
			}
			
			
		}
		finally
		{
			f.close();
		}
		
		}
		
		catch(Exception e)
		{
			
		}
				
	}

}
