package com.array_problems_easy;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class MinPsIntAdv {
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
	
	int[] positive = Arrays.stream(arr)
			.filter(x -> x >0)
			.sorted()
			.toArray();
	
	
}
}
