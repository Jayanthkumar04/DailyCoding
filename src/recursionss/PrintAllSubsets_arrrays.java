package recursionss;

import java.util.ArrayList;

public class PrintAllSubsets_arrrays {

	static ArrayList<Integer> al = new ArrayList<>();
	
	
	public static void printsubsets(int arr[],int i)
	{
		if(i == arr.length)
		{
			ArrayList<Integer> aa = new ArrayList<>();

			for(int j=0;j<=1;i++)
			{
				
			    
			}
			al.addAll(aa);
		
			return;
		}	
			printsubsets(arr,i+1);
			
			
			
			
			
		}
		
	}
	public static void main(String[] args) {

		
		int arr[]= {1,2,3};
		
		printsubsets(arr,0);
		
		
	}

}
