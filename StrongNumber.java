import java.io.*;
import java.util.*;
class StrongNumber 
{
    	static int strong(int n)
    	{
        	int s=0,d,f;
        	while(n!=0)
        	{
            	d=n%10;
            	f=1;
            	for(int i=1;i<=d;i++)
                		f=f*i;
            	s=s+f;
            	n=n/10;
        	}
        	return s;
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
            	if(a[i]==strong(a[i]))
                		sum=sum+a[i];
        	}
        	System.out.println(sum);
    }
}