package sortingTechniques;

public class ProblemOnSelectionSort {

	public static void main(String[] args) {

int arr[]= {10,1,5,89,90};

int count = 0;

for(int i=0;i<arr.length;i++)
{
	
	int idx=-1;
	
	int mx=Integer.MAX_VALUE;
	
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]<mx && arr[j]>0)
		{
			mx=arr[j];
			idx=j;
		}
	}
	
	arr[idx]=count;
	
	count--;
}

for(int i=0;i<arr.length;i++)
{
	
	System.out.println(arr[i]*(-1));	
	
}

	}

}
