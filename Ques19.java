package Sep23;

import java.util.*;
public class Ques19 {
    public static void main(String[] args) {
        
        Set<Integer> treeset1 = new TreeSet<Integer>();
        Integer[] n1 = {9,3,2,5,8,10};
        treeset1.addAll(Arrays.asList(n1));
        Set<Integer> treeset2 = new TreeSet<Integer>();
        Integer[] n2 = {9,3,2,5,8,10};
        treeset2.addAll(Arrays.asList(n2));
        if(treeset1.equals(treeset2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
     
    }



}
