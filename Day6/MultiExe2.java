package Day6;

import java.math.BigDecimal;  
public class MultiExe2{  

	public static void main(String[] argvs)  
	{  
		BigDecimal a1 = new BigDecimal(11);  
		BigDecimal a2 = new BigDecimal(17);  
		try  
		{    
			a1 = a1.divide(a2);  
			System.out.println(a1.toString());  
		}  
		catch(ArithmeticException ex)  
		{  
			System.out.println("Avoid diving by integers that leads to decimals " + ex);  
		}  
	}  
} 
