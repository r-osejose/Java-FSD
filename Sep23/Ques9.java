package Sep23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

 

public class Ques9 {
      public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Rose");
        list.add("Sona");
        list.add("Ron");
        list.add("Rusafid");
        list.add("Ram");
        list.add("Sravya");
        System.out.println("Actual LinkedList:"+list);
        List<String> list1 = new ArrayList<String>(list);
           
            System.out.println("Results after toarray operation:" + list1);
      }
    }
 