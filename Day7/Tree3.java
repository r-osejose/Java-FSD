package Day7;

import java.util.TreeSet;
import java.util.Iterator;

public class Tree3 {

	public static void main(String[] args) {
		TreeSet<String>t = new TreeSet<>();
		t.add("Rose");
		t.add("Pink");
		t.add("Yellow");
		t.add("Green");
		t.add("Blue");
		
		Iterator<String> itr = t.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());}
		System.out.println("");	
		System.out.println("First Element: "+t.first());	
		System.out.println("Last Element: "+t.last());
		}
		}

	


