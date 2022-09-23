package Sep23;

import java.util.*;
public class Ques20 {
    public static void main(String[] args) {
      
        TreeSet<Integer> tree = new TreeSet<Integer>();
        Integer t[] = {-4,7,2,10,9,3,-1};
        tree.addAll(Arrays.asList(t));
        
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        TreeSet<Integer> subset = new TreeSet<Integer>();
        subset = (TreeSet<Integer>)tree.subSet(tree.first(),n);   
        Iterator val = subset.iterator();
        while(val.hasNext())
                System.out.print(val.next()+" ");
       

   }



}
