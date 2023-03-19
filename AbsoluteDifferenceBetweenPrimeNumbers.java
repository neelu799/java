import java.io.*;
import java.util.*;
class AbsoluteDifferenceBetweenPrimeNumbers
{
  	static boolean isprime(int n)
    	{
        	int f=0,i;
        	for(i=1;i<=n;i++)
        	{
            	if(n%i==0)
                		f++;
        	}
        	return f==2;
    	}
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),min,max,i;
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	Arrays.sort(a);
        	min=999;
        	max=-1;
        	for(i=0;i<n;i++)
        	{
            	if(isprime(a[i]))
            	{
                		if(min>a[i])
                    		min=a[i];
                		if(max<a[i])
                    		max=a[i];
            	}
        	}
        	if(min!=999 && max!=-1)
            	System.out.println(max-min);
        	else
            	System.out.println(0);
    	}
}