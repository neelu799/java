import java.io.*;
import java.util.*;
class VedioShare
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        if(n>=30 && n<=50)
            System.out.println("Average");
        else if(n>=51 && n<=60)
            System.out.println("Good");
        else if(n>=61 && n<=80)
            System.out.println("Excellent");
        else
            System.out.println("Outstanding");
    }
}