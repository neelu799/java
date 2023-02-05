import java.util.*;
class HashMap4
{
	public static void main(String args[]) 
	{
    		HashMap<String, String> hashmap = new HashMap<String, String>();
    		hashmap.put("Key1", "Value1");
    		hashmap.put("Key2", "Value2");
    		Set<Map.Entry<String, String>> entrySet1 = hashmap.entrySet();
    		Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
    		while (entrySetIterator.hasNext()) 
		{
       		Map.Entry entry = entrySetIterator.next();
        		System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
   		}
  	}

}