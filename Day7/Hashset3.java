package Day7;

import java.util.HashSet;

public class Hashset3 {

	public static void main(String[] args) {
		HashSet<String>t = new HashSet<String>();
		HashSet<String>t1 = new HashSet<String>();

		
		t.add("Rose");		
		t.add("Rajagiri");
		t.add("Kochi");
		t.add("UST");
		t.add("Trivandrum");

		System.out.println("First Set: "+t);
		
		
		t1.add("Rose");		
		t1.add("Sona");
		t1.add("Rusu");
		t1.add("Sanjith");
		t1.add("Ron");
		t1.add("Kochi");

		System.out.println("Second Set: "+t1);	
		t.retainAll(t1);
		System.out.println("Same Contents: "+t);	

	}
		}

	


