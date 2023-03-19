import java.io.*;
import java.util.*;
class Savings
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int a,a1,a2,b,b1,b2,c,c1,c2;
        	a1=obj.nextInt();
        	a2=obj.nextInt();
        	b1=obj.nextInt();
        	b2=obj.nextInt();
        	c1=obj.nextInt();
        	c2=obj.nextInt();
        	a=a1-a2;
        	b=b1-b2;
        	c=c1-c2;
        	System.out.println(Math.max(Math.max(a,b),c));
    	}
}