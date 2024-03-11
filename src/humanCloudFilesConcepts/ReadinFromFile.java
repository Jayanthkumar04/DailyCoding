package humanCloudFilesConcepts;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class ReadinFromFile {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\HumanFiles\\newFile.txt");
		
		
		File f2 = new File("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\HumanFiles\\lastFile.txt");
		FileWriter fw = new FileWriter("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\HumanFiles\\lastFile.txt");
		try
		{
		
		fw.write("heljjfldsjfl sjlfjlsjfl fljlsjfljsf \n jlfjslfjlsj.dfjlksf");
		}
		
		finally
		{
			fw.close();
		}
		
		
		
		try
		{
			
			int i;
			
			
			while((i=fr.read())!= -1)
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
