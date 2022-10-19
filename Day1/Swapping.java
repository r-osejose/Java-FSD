import java.util.*;
public class Swapping{
public static void main(String a[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number (x):");
	int x = sc.nextInt();
		System.out.println("Enter a number (y):");
	int y = sc.nextInt();
	x=x+y;
	y=x-y;
	x=x-y;
			System.out.println("After Swapping");
		System.out.println("x:"+x);
		System.out.println("y:"+y);


}}