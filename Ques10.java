package Sep23;

import java.util.Collections;
import java.util.LinkedList;
public class Ques10 {
      public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Sona");
        linkedList.add("Rose");
        linkedList.add("Sravya");
        linkedList.add("Rusafid");
        linkedList.add("Ron");
        linkedList.add("Vismaya");
        System.out.println("Actual LinkedList:"+linkedList);
        Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);      
            Collections.shuffle(linkedList);
            System.out.println("Results after shuffle operation:" + linkedList);
      }
    }