import java.io.*;
import java.util.*;
class AbsoluteDifference
{
    	static int rev(int n)
    	{
        	int d,r=0;
        	while(n!=0)
        	{
            	d=n%10;
            	r=r*10+d;
            	n=n/10;
        	}
        	return r;
    	}
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n = obj.nextInt();
        	System.out.println(Math.abs(n-rev(n)));
    	}
}