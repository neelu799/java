import java.util.*;
import java.io.*;
class SumOfPrimeNumbersInArray
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
			int count=0;
			for(int j=2;j<=a[i];j++)
				count++;
			if(count==2)
				sum=sum+a[i];
			
		}
		System.out.println(sum);
	}
}