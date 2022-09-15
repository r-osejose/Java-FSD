package Day7;

import java.util.HashSet;

public class Hashset2 {

	public static void main(String[] args) {
		HashSet<String>t = new HashSet<String>();
		
		t.add("Rose");		
		t.add("Rajagiri");
		t.add("Kochi");
		t.add("UST");
		t.add("Trivandrum");
		HashSet<String>t1 = new HashSet<String>(t);


		System.out.println("Hash Set: "+t);	
		System.out.println("New Hash Set: "+t1);	

	}
		}

	


