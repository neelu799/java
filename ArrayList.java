import java.util.ArrayList;
class ArrayList1
{
	public static void main(String args[]) 
    {
    	
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(4);
        al.add(17);
        al.add(18);
        al.add(21);
        al.add(17);
		
          
        for(int i=0;i<al.size();i++)
        {	        	
        	System.out.println(al.get(i));
        }
        
    }

}