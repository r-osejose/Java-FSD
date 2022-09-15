package Day7;

import java.util.PriorityQueue;

public class Priorityqueue3 {

	public static void main(String[] args) {
		PriorityQueue<String>t = new PriorityQueue<String>();
		PriorityQueue<String>t1 = new PriorityQueue<String>();

		
		t.add("Rose");		
		t.add("Rajagiri");
		t.add("Kerala");
		t.add("UST");
		t.add("Trivandrum");

		System.out.println("First Queue: "+t);
		
		
		t1.add("Rose");		
		t1.add("UST");
		t1.add("India");
		t1.add("Rajagiri");
		t1.add("Kochi");

		System.out.println("Second Queue: "+t1);	
		
		for(String element : t) {
			System.out.print(t1.contains(element)?"Yes ":" No ");
		}

	}
		}

	


