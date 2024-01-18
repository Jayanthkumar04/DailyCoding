package _2DARRAYS;

import java.util.Scanner;

public class TakingMultipleMarksOfMultipleStudents {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enterr no of students");
		
		int stu = sc.nextInt();
		
		System.out.println("enter no of subjects");
		
		int sub=sc.nextInt();
		
		int store[][] = new int[stu][sub];
		
		for(int i=0;i<stu;i++)
		{
			System.out.println("enter student "+(i+1)+" marks");
			for(int j=0;j<sub;j++)
			{
		   
				store[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("rollno     marks1     marks2");
		for(int i=0;i<stu;i++)
		{
//			System.out.println("student "+(i+1)+" marks are:");
			System.out.print(i+1+"              ");
			for(int j=0;j<sub;j++) 
			{
		   
			 System.out.print(store[i][j]+"        ");
			}
			
			System.out.println();
		}
	}

}
