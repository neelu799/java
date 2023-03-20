import java.io.*;
import java.util.*;
class ModularExponentation
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int b=obj.nextInt();
        	int e = obj.nextInt();
        	int m = obj.nextInt();
        	System.out.println((int)Math.pow(b,e)%m);
    	}
}