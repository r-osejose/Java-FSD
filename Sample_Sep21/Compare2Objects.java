package Sample_Sep21;

public class Compare2Objects {

	   public static void main(String[] args) {
	       Double x = new Double(123.44);
	        Long y = new Long (12345);
	        
	        System.out.println("Checking two objects are equal");
	        if (x.equals(y)==true) {
	            System.out.println("\nBoth are equal");
	        }
	        else {
	            System.out.println("\nBoth are not equal");
	        }
	        
	    }



	}

