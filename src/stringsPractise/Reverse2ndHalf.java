package stringsPractise;

public class Reverse2ndHalf {

	public static void main(String[] args) {

		String ans = "jayanthy";
		
		System.out.println("before reverse :"+ans);
		char ch[] = ans.toCharArray();
		
		int i=ans.length()/2;
		
		int j=ans.length()-1;
		
		while(i<j)
		{
			char temp = ch[i];
			
			ch[i] = ch[j];
			
			ch[j] = temp;
			
			i++;
			j--;
		}
		
		System.out.print("after reverse  :");
		System.out.println(ch);
	
		
	}

}
