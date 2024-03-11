package HumanCloudBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparatorr {

	public static void main(String[] args) {

		Comparator<Integer> com = new Comparator<>()
				{
			
			       public int compare(Integer i,Integer j)
			      {
			    	  if(i%10 > j%10)
			    	  {
			    		  return 1;
			    	  }
			    	  else
			    		  return -1;
			      }
			
				};
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(19);ar.add(22);ar.add(11);ar.add(42);
		
		System.out.println(ar);
		
		Collections.sort(ar);
		
		System.out.println(ar);
		
		System.out.println("last digit comparision");
		
		Collections.sort(ar,com);
		
		System.out.println(ar);
		
	}

}
