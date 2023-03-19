import java.io.*;
import java.util.*;
class DigitalRoot
{
    	static int sum(int n)
    	{
        	int s=0,d;
        	while(n!=0)
        	{
            	d=n%10;
            	s=s+d;
            	n=n/10;
        	}
        	return s;
    	}
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n = obj.nextInt();
        	while(true)
        	{
            	if(n>=0 && n<=9)
            	{
                		System.out.println(n);
                		break;
            	}
            	else
                		n=sum(n);
        	}
    	}
}