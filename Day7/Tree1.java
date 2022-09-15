package Day7;

import java.util.TreeSet;
import java.util.Iterator;

public class Tree1 {

	public static void main(String[] args) {
		TreeSet<String>t = new TreeSet<>();
		t.add("Rose");
		t.add("Pink");
		t.add("Green");
		t.add("Blue");
		
		Iterator<String> itr = t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		}
	}


