import java.io.*;
import java.util.*;
class BackSpaceStringCompare 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s1 = obj.nextLine();
        	String s2 = obj.nextLine();
        	StringBuffer sb1 = new StringBuffer();
        	StringBuffer sb2 = new StringBuffer();
        	for(int i=0;i<s1.length()-1;i++)
        	{
            	if(s1.charAt(i)!='#' && s1.charAt(i+1)!='#')
                		sb1.append(s1.charAt(i));
        	}
        	for(int i=0;i<s2.length()-1;i++)
        	{
            	if(s2.charAt(i)!='#' && s2.charAt(i+1)!='#')
                		sb2.append(s2.charAt(i));
        	}
        	System.out.println((sb1.toString()).equals(sb2.toString())?1:0);
    	}
}