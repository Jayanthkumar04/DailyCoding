package ARRAYS;

public class NextGreatestMethod2 {

	public static void main(String[] args) {

		
		int arr[]= {12, 8, 60, 37, 2, 49, 16, 28, 21};
		for(int ans:arr)
		{
			System.out.print(ans+"   ");
		}
		int ans[]=new int[arr.length];
		
		ans[arr.length-1]=-1;
		
		int nge=arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--)
		{
			ans[i]=nge;
			
			nge=Math.max(nge,arr[i]);
			
		}
		
		
		
		System.out.println();
		for(int val:ans)
		{
			System.out.print(val+"   ");
		}
		
		
	}

}
