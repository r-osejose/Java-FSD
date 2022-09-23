package Sep23;

import java.util.*;
public class Ques4 {
   public static void main(String args[]){
      ArrayList<String> input_list = new ArrayList<String>();
      input_list.add("java");
      input_list.add("coding");
      input_list.add("is");
      input_list.add("fun");
      System.out.println("The list is defined as: " + input_list);
      Collections.sort(input_list);
      System.out.println("The sorted list is: " + input_list);
   }
}
