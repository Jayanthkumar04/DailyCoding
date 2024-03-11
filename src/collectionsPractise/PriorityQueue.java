package collectionsPractise;

import java.util.HashMap;

public class PriorityQueue {

	public static void main(String[] args) {

		String str="hello bye hello hello hello";
		
		String ch[] = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(int i=0;i<ch.length;i++)
		{
			
			if(str.contains(ch[i]))
			{
				Integer c = (int)hm.get(ch[i]);
				
				hm.put(ch[i],++c);
			}
			else
			{
				hm.put(ch[i],1);
			}
			
		}
		
		for(int i=0;i<ch.length;i++)
		{
			
			int anss=Integer.MIN_VALUE;
			
			int 
			
		}
		
		
	
	
	}

}
