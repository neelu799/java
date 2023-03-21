import java.io.*;
import java.util.*;
class SumOfAllMatrixElements
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n = obj.nextInt();
        	int m = obj.nextInt();
        	int a[][]=new int[n][m];
        	int i,j,s=0;
        	for(i=0;i<n;i++)
        	{
            	for(j=0;j<m;j++)
            	{
                		a[i][j]=obj.nextInt();
            	}
        	}
        	for(i=0;i<n;i++)
        	{
            	for(j=0;j<m;j++)
            	{
                		s=s+a[i][j];
            	}
        	}
        	System.out.println(s);
    	}
}