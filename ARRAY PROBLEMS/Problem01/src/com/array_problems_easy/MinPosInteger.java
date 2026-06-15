package com.array_problems_easy;
import java.util.Arrays;
import java.util.Scanner;

public class MinPosInteger {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the sixe of an array : ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				arr[j] = arr[i];
				j++;
			}
		}
		Arrays.sort(arr,0,j);
		for(int i=0;i<j;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		int missing=j+1;
		for(int i=0;i<j;i++)
		{
			if(arr[i]!=i+1)
			{
				missing = i+1;
				break;
			}
		}
		System.out.println("\n"+missing);
	}

}
