package Sep20;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the first number (Num1): ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number (Num2): ");
		int num2 = scan.nextInt();
		System.out.println("After Swapping");
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
	}

}
