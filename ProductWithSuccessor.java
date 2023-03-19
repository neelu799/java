import java.io.*;
import java.util.*;
class ProductWithSuccessor
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),i,sum;
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	sum=0;
        	for(i=0;i<n;i++)
            	sum=sum+a[i]*(a[i]+1);
        	System.out.println(sum);
    	}
}