 import java.util.*;
class HashSet 
{
    	public static void main(String args[]) 
	{
      	HashSet<String> hashset = new HashSet<String>();
      	hashset.add("Doctor");
      	hashset.add("Engineer");
      	hashset.add("Lawyer");
      	hashset.add("Police");
     		System.out.println("HashSet contains: "+ hashset);
      	String[] array = new String[hashset.size()];
      	hashset.toArray(array);
      	System.out.println("Array contains: ");
      	for (String str : array) 
		{
          		System.out.println(str);
      	}
    	}
}