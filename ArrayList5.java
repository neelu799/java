import java.util.ArrayList;
class ArrayList5
{
	public static void main(String args[]) 
	{ 
      	ArrayList<Integer> al = new ArrayList<Integer>();
        	al.add(11);
       	al.add(12);
        	al.add(23);
        	al.add(96);
        	al.add(17);
        	if (al.contains(7)) 
		{
            	System.out.println("7 was found in the list");
        	} 
		else 
		{
            	System.out.println("7 was not found in the list");
        	}
      }
}