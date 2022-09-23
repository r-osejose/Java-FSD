package Sep23;

import java.util.*;
public class Ques7 {
   public static void main(String args[]){
      LinkedList<String> l1 = new LinkedList<String>();
      l1.add("Red");
      l1.add("Blue");
      l1.add("Black");
      System.out.println("The list is defined as: " +l1);
      l1.addFirst("Rose");
      l1.addLast("Pink");
      System.out.println("The list after adding elements is: " + l1);
   }
}
