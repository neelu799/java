import java.util.*;
import java.io.*;
class SumOfOddNumbersInArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				sum=sum+a[i];
		}
		System.out.println(sum);
	}
}