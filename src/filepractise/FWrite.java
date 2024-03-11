package filepractise;

import java.io.FileWriter;

public class FWrite {

	public static void main(String[] args) {

		try
		{
		FileWriter w = new FileWriter("C:\\Users\\jayanth kumar\\OneDrive\\Desktop\\all files\\newhc\\cfile.txt");
		
		try
		{
		w.write("i am new file using operations \n bye prendss");
		}
		finally {
			w.close();
		}
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
