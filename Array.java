package Day5;

import java.util.Scanner;

public class Array 
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array :");
			int size = sc.nextInt();
			int a [] = new int [size];
			
			System.out.print("Enter a element :");
			for(int i=0; i<a.length; i++)
			{
			 
				a[i]=sc.nextInt();
			}
			
			for(int i =0; i<a.length; i++)
			{
				System.out.print(a[i]+" ");
			}
		}

}
