package collectionsPractise;

import java.util.HashMap;

public class HashMapPrac2 {

	public static void main(String[] args) {

//		1. Write a Java program to associate the specified value with the specified key in a HashMap.
		
		HashMap<Integer,String> hm = new HashMap<>();
		
		
		hm.put(1,"pre-school");
		
		hm.put(2, "school");
		
		hm.put(3, "interr");
		
		hm.put(4, "college");
		
		hm.put(5, "job");
		
		System.out.println("1. Write a Java program to associate the specified value with the specified key in a HashMap.");
		System.out.println(hm.entrySet());
		System.out.println();
		
		
//		2. Write a Java program to count the number of key-value (size) mappings in a map.
		
		System.out.println("2. Write a Java program to count the number of key-value (size) mappings in a map.");
		System.out.println(hm.size());
		System.out.println();
		
//		3. Write a Java program to copy all mappings from the specified map to another map.
		
		System.out.println("3. Write a Java program to copy all mappings from the specified map to another map.");
		HashMap<Integer,String> hm2 = new HashMap<>();
		hm2.putAll(hm);
		System.out.println(hm2);
		System.out.println();
		
//		4. Write a Java program to remove all mappings from a map.
		
		System.out.println("4. Write a Java program to remove all mappings from a map.");
		hm2.clear();
		
		System.out.println(hm2);
		
//		5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
		System.out.println("5. Write a Java program to check whether a map contains key-value mappings (empty) or not.");
	    
		System.out.println(hm2.isEmpty());
		
		System.out.println(hm.isEmpty());
		
		System.out.println();
		
//		6. Write a Java program to get a shallow copy of a HashMap instance.
	    System.out.println("6. Write a Java program to get a shallow copy of a HashMap instance.");
	    
	    hm2=hm;
	    
	    System.out.println(hm2);
	    
	    hm2.remove(1);
	    
	    System.out.println("hm2"+hm2);
	    System.out.println("hm"+hm);
	    System.out.println();
	    
//	    7. Write a Java program to test if a map contains a mapping for the specified key.
	    
	    System.out.println("7. Write a Java program to test if a map contains a mapping for the specified key.");
	    
	    System.out.println(hm.containsKey(3));
	    System.out.println();
	    
	    
//	    8. Write a Java program to test if a map contains a mapping for the specified value.
	    
	    System.out.println("8. Write a Java program to test if a map contains a mapping for the specified value.");
	    System.out.println(hm.containsValue("job"));
	    System.out.println();
	    
//	    9. Write a Java program to create a set view of the mappings contained in a map.
	    System.out.println("9. Write a Java program to create a set view of the mappings contained in a map.");
	    System.out.println(hm.entrySet());
	    System.out.println();
	    
//	    10. Write a Java program to get the value of a specified key in a map.
	    System.out.println("10. Write a Java program to get the value of a specified key in a map.");
	    System.out.println(hm.get(4));
	    System.out.println();
	    
//	    11. Write a Java program to get a set view of the keys contained in this map.
	    System.out.println("11. Write a Java program to get a set view of the keys contained in this map.");
	    System.out.println(hm.keySet());
	    System.out.println();
	    
//	    12. Write a Java program to get a collection view of the values contained in this map.
	    System.out.println("12. Write a Java program to get a collection view of the values contained in this map.");
	    System.out.println(hm.values());
	    System.out.println();
	    
//	    13.Anagram or not
        System.out.println("13.Anagram or not");	    
	    String s1="ant";
	    String s2="tana";
	    
	    if(s1.length() != s2.length()) 
	    {
	    	System.out.println("it is not an anagram");
		    
	    }
	    else
	    {
	    
        HashMap<Character,Integer> an1 = new HashMap<>();
	    HashMap<Character,Integer> an2 = new HashMap<>();
	    
	    
	    char arr1[] = s1.toCharArray();
	    char arr2[] = s2.toCharArray();
	    
	    for(int i=0;i<s1.length();i++)
	    {
	    
	    	if(an1.get(arr1[i]) == null)
	    	{
	    		an1.put(arr1[i],1);
	    	}
	    	else
	    	{
	    		int count = an1.get(arr1[i]);
	    		
	    		an1.put(arr1[i], ++count);
	    	}
	    	
	    }
	    
	    for(int i=0;i<s2.length();i++)
	    {
	    
	    	if(an2.get(arr2[i]) == null)
	    	{
	    		an2.put(arr2[i],1);
	    	}
	    	else
	    	{
	    		int count = an2.get(arr2[i]);
	    		
	    		an2.put(arr2[i], ++count);
	    	}
	    	
	    }
	    
	    
	    if(an1.equals(an2))
	    {
	    	System.out.println("it is anagram");
	    }
	    
	    }
	    
	    
System.out.println("=======================================================================>");	
	    
//Max occurence of the word in the string

String st ="hello world hello how r u u u how how how";


HashMap<String,Integer> hmm1 = new HashMap<>();

HashMap<String,Integer> hmm2 = new HashMap<>();

String answer[] = st.split(" ");

System.out.println(answer.length);

for(String q : answer)
{
	if(hmm1.containsKey(q))
	{
		hmm1.put(q, hmm1.get(q)+1);
	}
	else
	{
		hmm1.put(q, 1);
	}
}


int mx = 0;

String ans=null;

for(String i : hmm1.keySet())
{
	if((hmm1.get(i))>mx)
	{
		mx = hmm1.get(i);
	    ans=i;
	}
	
}

       System.out.println(hmm1);

       System.out.println(ans);




	}

}
