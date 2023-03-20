import java.io.*;
import java.util.*;
class LuckyDraw
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),i,len;
        	boolean flag=true;
        	int a[]= new int [3];
        	i=0;
        	while(n!=0)
        	{
            	a[i++]=n%10;
            	n=n/10;
        	}
        	len=i;
        	Arrays.sort(a);
        	for(i=0;i<len-1;i++)
        	{
            	if(a[i+1]-a[i]>2)
			{
                		flag=false;
                		break;
            	}
        	}
        	System.out.println((flag)?"Yes":"No");
    	}
}