package Day7_2;

import java.util.HashMap;

public class Map5 {

	public static void main(String[] args) {
		HashMap<String,Integer> t = new HashMap<>();
		HashMap<String,Integer> t1 = new HashMap<>();

		t.put("Trivandrum",1);		
		t.put("Kollam",2);
		t.put("Kochi",3);
		t.put("Pathanamthitta",4);
		t.put("Kannur",5);
		System.out.println("First HashMap: "+t);
		System.out.println("Second HashMap: "+t1);

		System.out.println("Is First HashMap empty? " +t.isEmpty());
		System.out.println("Is Second HashMap empty? " +t1.isEmpty());	

		


	}
		}

	


