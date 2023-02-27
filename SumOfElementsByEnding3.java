import java.io.*;
import java.util.*;
class SumOfElementsByEnding3 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n,i,s;
        	n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	s=0;
        	for(i=0;i<n;i++)
        	{
            	if(a[i]%10==3)
                		s=s+a[i];
        	}
        	System.out.println(s);
    	}
}