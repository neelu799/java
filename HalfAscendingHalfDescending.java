import java.io.*;
import java.util.*;
class HalfAscendingHalfDescending
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),i;
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	Arrays.sort(a);
        	for(i=0;i<n/2;i++)
            	System.out.print(a[i]+" ");
        	for(i=n-1;i>=n/2;i--)
            	System.out.print(a[i]+" ");
    	}
}