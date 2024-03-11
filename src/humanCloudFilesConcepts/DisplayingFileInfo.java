package humanCloudFilesConcepts;

import java.io.File;

public class DisplayingFileInfo {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\HumanFiles\\newFile.txt");
		
		if(f.exists()) 
		{
			System.out.println("truee");
		   
			System.out.println("file name: "+f.getName());
			
			System.out.println("location: "+f.getAbsolutePath());
			
			System.out.println("write: "+f.canWrite());
			
			System.out.println("read: "+f.canRead() );
			
			
		}
		
		else
		{
			System.out.println("file doesnot existt");
		}
	}

}
