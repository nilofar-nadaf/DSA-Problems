package secondLargest;
import java.util.Scanner;
public class OptimalApproach {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int n;
		System.out.println("Enter the sixe of an array : ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		int secMax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is ");
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(" "+arr[j]);
		}
		
		for(int k=0;k<arr.length;k++)
		{
			if(max < arr[k])
			{
				max = arr[k];
				
			}
			else {
				if(secMax<max)
				{
					secMax = arr[k+1];
				}
				
			}
		}
		System.out.print("The second largest Element is "+secMax);
	}

}
