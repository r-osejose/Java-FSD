package Day7_2;

import java.util.HashMap;
import java.util.Set;

public class Map10{
	public static void main(String[] args) {
		HashMap<Integer,String> t = new HashMap<Integer,String>();
		
		t.put(1,"Trivandrum");		
		t.put(2,"Kollam");
		t.put(3,"Kochi");
		t.put(4,"Pathanamthitta");
		t.put(5,"Kannur");
		
		System.out.println("Hash Map: "+t);	
		String Value;
		Value = t.get(3);
		System.out.println("Value of key '3' is : "+Value);	

	

			
	}
}

	


