package Day7_2;

import java.util.HashMap;

public class Map3 {

	public static void main(String[] args) {
		HashMap<String,Integer>t = new HashMap<>();
		HashMap<String,Integer>t1 = new HashMap<>();

		
		t.put("Kochi",1);		
		t.put("Trivandrum",2);
		t.put("Pathanamthitta",3);


		System.out.println("First HashMap: "+t);
		
		t1.put("Rose",10);		
		t1.put("Sona",15);
		t1.put("Rusafid",20);
;

		System.out.println("Second HashMap: "+t1);	
		t.putAll(t1);
		System.out.println("All Elements: "+t);	

	}
		}

	


