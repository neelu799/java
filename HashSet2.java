import java.util.HashSet;
class HashSet2
{
	public static void main(String args[]) 
	{
      	HashSet<Integer> hs = new HashSet<Integer>();
        	hs.add(3);
       	hs.add(17);
        	hs.add(6);
        	hs.add(9);
        	hs.add(7);
        	if (hs.contains(7)) 
		{
            	System.out.println("7 was found in the list");
        	} 
		else 
		{
            	System.out.println("7 was not found in the list");
        	}
    	}
}