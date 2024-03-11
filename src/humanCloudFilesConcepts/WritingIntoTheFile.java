package humanCloudFilesConcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoTheFile {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\HumanFiles\\newFile.txt");
		
		try
		{
			
			f.write("you are the best thing in the world");
			System.out.println("wrote successfully");
		}
		
		finally
		{
			
			f.close();
		}
		
	}

}
