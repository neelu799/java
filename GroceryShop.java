import java.io.*;
import java.util.*;
class GroceryShop
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n = obj.nextInt();
        	while(true)
        	{
            	if(n%10==0)
            	{
                		System.out.println(n);
                		break;
            	}
            	n++;
        	}
    	}
}