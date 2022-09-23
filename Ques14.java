package Sep23;

import java.util.*;
public class Ques14 {
    public static void main (String[] args) {
       LinkedList<String> list = new LinkedList<String>();
         
        list.add("Hello");
        list.add("Hi");
        list.add("World");
        list.add("Enjoy");
        list.add("Happy");
         
        System.out.println("LinkedList:\t" + list);
        System.out.println("The last element is removed:\t" + list.removeLast());       
        System.out.println("Final LinkedList:\t" + list);
        System.out.println("The first element is removed:\t" + list.removeFirst());
        System.out.println("Final LinkedList:\t" + list);
    }
}