package Sample7_Sep20;

//Palindrome

import java.util.Scanner;
import java.util.*;

public class Pgm3 {

   public static void main(String[] args) {
         String Original,Reverse="";
            Scanner in = new Scanner (System.in);
            
            System.out.println("Enter a string : ");
            Original = in.nextLine();
            int length = Original.length();
            
            for(int i=length-1;i>=0;i--) {
                Reverse = Reverse + Original.charAt(i);
            }
            if(Original.compareTo(Reverse)==0)
            {
            System.out.println(Original+" is a palindrome");
            }
            else
            {
                System.out.println(Original+" is not a palindrome");
            }



   }



}
