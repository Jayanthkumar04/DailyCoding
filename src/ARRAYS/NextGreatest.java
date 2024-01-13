package ARRAYS;

public class NextGreatest {

	public static void main(String[] args) {

		int arr[]= {12, 8, 60, 37, 2, 49, 16, 28, 21};
		for(int ans:arr)
		{
			System.out.print(ans+" ");
		}
		int ans[]=new int[arr.length];
		
		ans[arr.length-1]=-1;
		for(int i=0;i<arr.length-1;i++)
		{
			int mx=Integer.MIN_VALUE;
			
			for(int j=i+1;j<arr.length;j++)
			{
				mx=Math.max(mx, arr[j]);
			}
			
			ans[i]=mx;
		}
		
		System.out.println();
		
		for(int sol:ans)
		{
			System.out.print(sol+" ");
		}
		
	}

}
