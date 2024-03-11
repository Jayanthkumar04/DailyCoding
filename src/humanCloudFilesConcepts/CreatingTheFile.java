package humanCloudFilesConcepts;

import java.io.File;

public class CreatingTheFile {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\HumanFiles\\newFile.txt");
		
		try
		{
			if(f.createNewFile())
			{
				System.out.println("file created successfully");
			}
			else
			{
				System.out.println("already exist");
			}
		}
		catch(Exception e)
		{
			System.out.println("error occurred");
		}
		
		
	}

}
