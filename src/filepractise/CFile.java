package filepractise;

import java.io.File;

public class CFile {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\newhc\\cfile.txt");
		
		try
		{
			if(f.createNewFile())
		              System.out.println("file created successfully");
			else
				System.out.println("file already exists");
		}
		catch(Exception e)
		{
		          System.out.println("some error encountered");
		}
	}

}
