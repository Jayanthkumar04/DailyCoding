package ARRAYS;

public class ArrayPalindrome {

	public static void main(String[] args) {

		int arr[] = {50, 10 ,20 ,30 ,20 ,10 ,50};
		
		int i=0,j=arr.length-1;
		
		boolean flag=true;
		while(i < j)
		{
			if(arr[i] == arr[j])
			{
				i++;
				j--;
			}
			else
			{
				flag = false;
				break;
			}
		}
		
		if(flag == true) System.out.println("yes palindrome");
		else System.out.println("not a palindrome");
	}

}
