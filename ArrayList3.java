import java.util.ArrayList;
class ArrayList3
{
	public static void main(String args[]) 
	{
      	ArrayList<String> cities = new ArrayList<>();
      	cities.add("Banglore");
      	cities.add("chennai");
      	cities.add("hyderabad");
      	cities.add("mumbai");
		cities.add("calcutta");

      
      	String citinames[]=cities.toArray(new String[cities.size()]);

      	for(String str : citinames) 
		{
        	System.out.println(str);      
     		}
    }
}