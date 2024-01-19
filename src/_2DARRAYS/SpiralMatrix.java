package _2DARRAYS;

public class SpiralMatrix {

	public static void main(String[] args) {

		
		int arr[][]= {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
		
		int minr=0,minc=0,maxr=arr.length-1,maxc=arr[0].length-1;
		
		int n=0;


		while(n <= arr.length*arr[0].length)
		{
		
			for(int i=minc;i<=maxc;i++)
			{
				System.out.print(arr[minr][i]+"   ");
				n++;
			}
			
			if(n>=arr.length*arr[0].length)
				break;
			
			minr++;
			
			for(int i=minr;i<=maxr;i++)
			{
				System.out.print(arr[i][maxc]+"   ");
				n++;
			}
			maxc--;

			if(n>=arr.length*arr[0].length)
				break;
			
			for(int i=maxc;i>=minc;i--)
			{
				System.out.print(arr[maxr][i]+"   ");
				n++;
			}
			if(n>=arr.length*arr[0].length)
				break;
			
			maxr--;
			for(int i=maxr;i>=minr;i--)
			{
				System.out.print(arr[i][minc]+"   ");
			n++;
			}
			minc++;
			
			
			
			
	     }
	
	
	}
}
