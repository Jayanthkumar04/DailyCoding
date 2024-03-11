package humanCloudFilesConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFileToAnother {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\HumanFiles\\newFile.txt");
		
		File f2 = new File("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\HumanFiles\\newFile2.txt");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\HumanFiles\\newFile2.txt");
		
		
		
		int i;
		
		
		
		while((i=fis.read())!=-1)
		{
			{
				fos.write((char)i);
			}
			
		}
		
		System.out.println("data copied successfully");
		
		
	}

}
