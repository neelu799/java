import java.io.*;
import java.util.*;
class SumOfAllEvenElements
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int a[][]=new int[3][3];
        	int i,j,s=0;
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		a[i][j]=obj.nextInt();
            	}
        	}
        	for(i=0;i<3;i++)
        	{
            	for(j=0;j<3;j++)
            	{
                		if(a[i][j]%2==0)
                    	s=s+a[i][j];
            	}
        	}
        	System.out.println(s);
	}
}
   