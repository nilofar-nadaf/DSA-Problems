package com.apttech;

import java.util.Scanner;

public class Program01 {
	static int sumOfDigits(int arr[],int n)
	{
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			while(n>0)
			{
				sum = sum + (n%10);
				n = n/10;
			}
		}
		return sum;
	}
	static boolean palindrome(int n)
	{
		int temp=n;
		int rev=0;
		while(temp>0)
		{
			rev = rev * 10 + (temp % 10);
			temp = temp/10;
		}
		return rev == n;
	}
    static int frequency(int arr[],int num)
    {
    	int count=0;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]==num)
    		{
    			count++;
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=max)
			{
				max = arr[i];
			}
		}
		int[] result = new int[n];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]< max && frequency(arr,arr[i]) == 1 && palindrome(arr[i]) && sumOfDigits(arr,arr[i])% 5 != 0 )
			{
				result[i] = arr[i];
				count++;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(result[i]+" ");
		}
		System.out.println("Count : "+count);
		

	}

}
