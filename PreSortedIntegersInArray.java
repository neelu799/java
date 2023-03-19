import java.io.*;
import java.util.*;
class PreSortedIntegersInArray
{
    	public static void main(String[] args) 
	{
       	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),i,c=0;
        	int a[]=new int[n];
        	int b[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
            	b[i]=a[i];
        	Arrays.sort(a);
        	c=0;
        	for(i=0;i<n;i++)
        	{
            	if(a[i]==b[i])
                		c++;
        	}
        	System.out.println(c);
    	}
}