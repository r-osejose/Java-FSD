package Sample7_Sep20;

import java.util.Scanner;

public class Pgm4{    
   
  public static void main(String[] args){   
	  Scanner scan=new Scanner (System.in);
      
      System.out.println("Enter a string : ");
      String string = scan.nextLine();
     

String a[]=string.split(" ");
String l=a[0];
String sm=a[0];
for(int k=1;k<(a.length);k++)
{
    if(l.length()>=a[k].length())
        l=a[k];
    if(sm.length()<=a[k].length())
        sm=a[k];
}
System.out.println("'"+l+"' is the smallest string.");
System.out.println("'"+sm+"' is the longest string.");





}





}