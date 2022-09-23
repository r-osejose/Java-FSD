package Sep23;

import java.util.*;
public class Ques13 {
    public static void main(String[] args)
    {
ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(2);
        l2.add(4);
        l2.add(6);
ArrayList<Integer> merge = new ArrayList<Integer>();
        merge.addAll(l1);
        merge.addAll(l2);
System.out.println("L1 : "+l1);
System.out.println("L2 : "+l2);
System.out.println("Merged : "+merge);
}
}


