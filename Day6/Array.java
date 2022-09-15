package Day6;

public class Array {

	public static void main(String[] args) {
		try {
			int n[]=new int[5];
			n[0]=10;
			n[1]=20;
			n[2]=30;
			n[3]=40;
			n[4]=50;
			System.out.println(n[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");			
		}
	}
}
