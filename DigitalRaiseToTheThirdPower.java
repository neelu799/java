import java.io.*;
import java.util.*;
class DigitalRaiseToTheThirdPower
{
    	static int sum(int n)
    	{
        	int s=0,d;
        	while(n!=0)
        	{
            	d=n%10;
            	s=s+(d*d*d);
            	n=n/10;
        	}
        	return s;
    	}
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),i;
        	for(i=2;i<=n;i++)
        	{
            	if(i==sum(i))
                		System.out.print(i+" ");
        	}
    	}
}