import java.util.*;
class HashSet2 
{
    	public static void main(String args[]) 
	{
      	HashSet<String> hs = new HashSet<String>();
      	hs.add("Soccer");
      	hs.add("Football");
      	hs.add("Baseball");
      	hs.add("Basketball");
      
      	String[] array = new String[hs.size()];
      	int index = 0;
      	for (String element : hs)
      	{
          		array[index++] = element;
      	}
      	System.out.println("Array object contains: ");
      	for (String str: array) 
		{
          		System.out.println(str);
      	}
    	}
}