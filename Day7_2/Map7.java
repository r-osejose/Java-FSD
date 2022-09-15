package Day7_2;

import java.util.HashMap;

public class Map7 {

	public static void main(String[] args) {
		HashMap<Integer,String> t = new HashMap<>();
		
		t.put(1,"Trivandrum");		
		t.put(2,"Kollam");
		t.put(3,"Kochi");
		t.put(4,"Pathanamthitta");
		t.put(5,"Kannur");

			System.out.println("Hash Map: "+t);	
			System.out.println("Is key '20' present? "+ t.containsKey(20));	
			System.out.println("Is key '3' present? "+ t.containsKey(3));	
	}
}

	


