package Sep23;

import java.util.*;
class Ques8 {
    public static void main(String[] args)
    {
  
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(11);
        ll.add(12);
        ll.add(13);
        ll.add(14);
        ll.add(15);
        int element1 = 11;
        int element2 = 14;
  
        System.out.println("Linked List Before Swapping :-");
  
        for (int i : ll) {
            System.out.println(i + " ");
        }
        int index1 = ll.indexOf(element1);
        int index2 = ll.indexOf(element2);
  
        
        if (index1 == -1 || index2 == -1) {
            System.out.println("no element found ");
            System.exit(0);
        }
            ll.set(index1, element2);
            ll.set(index2, element1);
       
        System.out.println("Linked List After Swapping :-");
        for (int i : ll) {
            System.out.print(i + " ");
        }
    }
  
    }
 