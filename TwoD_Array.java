package Day5;

import java.util.Scanner;

public class TwoD_Array 
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a row  size : ");
	int row = sc.nextInt();
	System.out.println("Enter a column size :");
	int col = sc.nextInt();
	int a [][] = new int [row][col];
	
	System.out.println("Enter a element : ");
	for(int i =0; i<a.length; i++)
	{
		for(int j=0; j<a[i].length; j++)
		{
			a[i][j]= sc.nextInt();
		}
	}
	System.out.println("The 2D array is: ");
	for(int i=0; i<a.length; i++)
	{
		for(int j=0; j<a[i].length; j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
		
	}
}
  
}
