import java.io.*;
import java.util.*;
class PerfectMath
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i,s,k;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	k=obj.nextInt();
        	s=0;
        	for(i=0;i<n;i++)
            	s=s+a[i]%k;
        	System.out.println(s);
    	}
}