package com.apttech;

import java.util.Scanner;

public class Program02 {
	static int sum(int arr[])
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
    static boolean evenCheck(int num)
    {
    	return num%2 == 0;
    }
    static boolean endNum(int num)
    {
    	int lastDigit=0;
    	lastDigit = num % 10;
    	return lastDigit != 0;
    }
    static boolean numOfDigits(int arr[],int n)
    {
    	int sum = 0;
    	for(int i=0;i<arr.length;i++)
    	{
    		sum = sum + (arr[i]%10);
    		n = n/10;
    	}
    	return sum>5;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		double avg = sum(arr)/n;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>avg && evenCheck(arr[i]) && endNum(arr[i]) && numOfDigits(arr,arr[i]))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
