import java.util.*;
class HashMap2
{
	public static void main(String args[]) 
	{
		    HashMap<String, String> hashmap = new HashMap<String, String>();
		    hashmap.put("Key1", "Value1");
		    hashmap.put("Key2", "Value2");
		    Set<String> keySet = hashmap.keySet();
		    Iterator<String> keySetIterator = keySet.iterator();
		    while (keySetIterator.hasNext()) 
		    {
		   	 String key = keySetIterator.next();
		       System.out.println("key: " + key + " value: " + hashmap.get(key));
		    }
	}
}