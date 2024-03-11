package filepractise;

import java.io.File;

public class FInfo {

	public static void main(String[] args) {

		
		File f = new File("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\newhc\\cfile.txt");
		
		if(f.exists())
		{
		
			System.out.println("file name     :"+f.getName());
			
			System.out.println("file path     :"+f.getAbsolutePath());
			
			System.out.println("file canwrite :"+f.canRead());

			System.out.println("file canread  :"+f.canWrite());
			
			System.out.println("file length   :"+f.length());
			  
		}
		
		
		
		
	}

}
