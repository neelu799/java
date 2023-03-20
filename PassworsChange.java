import java.io.*;
import java.util.*;
class PassworsChange
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	for(int i=0;i<s.length();i++)
        	{
            	if(s.charAt(i)>='a' && s.charAt(i)<='z')
                		System.out.print((char)(s.charAt(i)-32));
            	else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
                		System.out.print((char)(s.charAt(i)+32));
        	}
    	}
}