import java.io.*;
import java.util.*;
class LastAndSecondLast 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	String s = obj.nextLine();
        	System.out.println(s.charAt(s.length()-1)+","+s.charAt(s.length()-2));
    	}
}