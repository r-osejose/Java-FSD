package Sep23;

import java.util.*;
public class Ques18 {
    public static void main(String[] args) {
        
        Set<String> s = new HashSet<String>();
        String[] str = {"hello","world","apple","ball" };
        s.addAll(Arrays.asList(str));
        System.out.println(s);
        s.clear();
        System.out.println(s);


   }



}