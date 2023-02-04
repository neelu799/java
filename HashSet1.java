import java.util.*;
class HashSet1
{
	 public static void main(String args[]) 
	 {
       	HashSet<String> hashset = new HashSet<String>();
    		hashset.add("Pear");
    		hashset.add("Apple");
   		hashset.add("Orange");
    		hashset.add("Papaya");
    		hashset.add("Banana");
   
    		for(String str : hashset)
		{
        		System.out.println(str);
    		}
 	 }
}