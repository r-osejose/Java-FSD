package Sample7_Sep20;

import java.util.Scanner;

public class Pgm5 {
	public static void main(String[] args){   
		  Scanner scan=new Scanner (System.in);
	      
	      System.out.println("Enter a string : ");
	      String string = scan.nextLine();
  	        int c=0,z=0;
	    	String []sp=string.split(" ");
	    	for (int i = 0; i < sp.length; i++)
	    	{
	    	            char []ch=sp[i].toCharArray();
	    	            
	    	            for(int j=0;j<=ch.length/2;j++)
	    	            {
	    	                if(ch[j]==ch[ch.length-j-1])
	    	                {
	    	                    c++;
	    	                }
	    	                
	    	                if(c==ch.length/2)
	    	                {
	    	                z=c;
	    	                    for(int k=0;k<ch.length;k++)
	    	                    {
	    	                        System.out.print("*");
	    	                    }
	    	                    System.out.print(" ");
	    	                }
	    	                    
	    	            }
	    	            if(z!=ch.length/2)
	    	            {
	    	                
	    	            System.out.print(sp[i]+" ");
	    	        
	    	        }
	    	            c=0;
	    	            z=0;
	    	        }    
	    	        



	    	}
	    		      
	      
	}

