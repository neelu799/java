import java.io.*;
import java.util.*;
class SumOfPalindromeNumbersInArray
{
    	static int rev(int n)
    	{
        	int r=0,d;
        	while(n!=0)
        	{
            	d=n%10;
            	r=r*10+d;
            	n=n/10;
        	}
        	return r;
    	}
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n = obj.nextInt();
        	int i,sum=0;
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
        	{
            	if(a[i]==rev(a[i]))
                		sum=sum+a[i];
        	}
        	System.out.println(sum);
    	}
}