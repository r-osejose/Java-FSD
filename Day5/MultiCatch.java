package Day5;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			int arr[] = new int[4];
			arr[3]=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of exception occured");
		}
	
		System.out.println("Rest of the code");

	}
}
