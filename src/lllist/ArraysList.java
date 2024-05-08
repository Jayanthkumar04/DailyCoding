package lllist;

import java.util.Arrays;

public class ArraysList {
	
Object[] objArray = {};

int size = 0;

public ArraysList()
{
	objArray=new Object[10];
}

public void add(Object obj)
{
	if(size == objArray.length)
	{
		incrcap();
	}
	else
	{
		objArray[size++]=obj;
	}
}
public void incrcap()
{
	int inc = ((objArray.length*3)/2)+1;

    objArray = Arrays.copyOf(objArray,inc);
    
}

public int size()
{
	return size;
}

public void display()
{
	for(int i=0;i<size;i++)
	{
		System.out.print(objArray[i]+"  ");
	}
}

public Object get(int index)
{
	return objArray[index];
}

	public static void main(String[] args) {

		ArraysList al = new ArraysList();
		
		al.add(10);al.add(30);al.add(89);
		
		al.display();
		
		System.out.println(al.size());
	}

}
