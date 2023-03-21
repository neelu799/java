import java.io.*;
import java.util.*;
class ReadingAndWritingMatrixElement
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n = obj.nextInt();
        	int m = obj.nextInt();
        	int a[][]=new int[n][m];
        	int i,j;
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
                		System.out.print(a[i][j]+" ");
            	}
            	System.out.println();
        	}
    	}
}