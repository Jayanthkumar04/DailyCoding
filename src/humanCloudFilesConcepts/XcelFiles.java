package humanCloudFilesConcepts;

import java.io.FileReader;

public class XcelFiles {

	public static void main(String[] args) {

		try
		{
		FileReader f = new FileReader("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\javaprac.xlsx");
		
		int i=0;
		
		while((i=f.read()) != -1)
		{
			System.out.print((char)i);
		}
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
