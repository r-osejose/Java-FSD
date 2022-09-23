package Sep23;

import java.util.ArrayList;
class Ques6 {
     
      public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<>();
          list.add("Red");
          list.add("Black");
          list.add("Blue");
          list.add("Pink");
          System.out.println(list);
          list.set(1, "Rose");
          System.out.println(list);
     
      }
    }
