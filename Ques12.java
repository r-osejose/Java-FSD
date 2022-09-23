package Sep23;
import java.util.*;
public class Ques12 {
    public static void main(String args[])
    {     
        LinkedList<String> l = new LinkedList<String>();
    
        l.add("Rose");
        l.add("Sona");
        l.add("Rusafid");
        l.add("Ron");
        l.add("Vismaya");
        
        System.out.println("The elements of LinkedList are: "+l);
        
       LinkedList<String> clone = (LinkedList<String>)l.clone();
       System.out.println("Cloned LinkedList: " + clone);
    }
}