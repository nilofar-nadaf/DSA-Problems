package largestNumberFind;
import java.util.Scanner;
public class Largestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MIN_VALUE;
		int n;
		System.out.println("Enter the sixe of an array : ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
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
			if(min < arr[k])
			{
				min = arr[k];
			}
		}
		System.out.println("\nThe Max Value in an array is : "+min);

	}

}
