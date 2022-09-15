package Day6;

public class MultiExe {  
	void divide(int a, int b)   
	{  
	int res;  
	try  
	{  
	res = a / b;  
	System.out.println("Result came after division is: " + res);  
	}  
	catch(java.lang.ArithmeticException ex)  
	{  
	System.out.println("Should avoid dividing by 0 " + ex);  
	}  
	  
	  
	}  
	  
	public static void main(String argvs[])  
	{  
	MultiExe obj = new MultiExe();  
	obj.divide(1, 0);  
	}  
	} 
  
