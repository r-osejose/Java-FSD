package Day7;

import java.util.TreeSet;

public class Tree4 {

	public static void main(String[] args) {
		TreeSet<Integer>t = new TreeSet<Integer>();
		TreeSet<Integer>t1 = new TreeSet<Integer>();
		
		t.add(1);		
		t.add(2);
		t.add(7);
		t.add(8);
		t.add(6);
		t.add(0);
		t.add(3);
		t.add(9);
		
		System.out.println("Tree Set: "+t);	
		t1 = (TreeSet)t.headSet(7);
		System.out.println("Tree Set less than 7: "+t1);	


	}
		}

	


