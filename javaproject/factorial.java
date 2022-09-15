package javaproject;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		int s=1;
		for(int i=1;i<num;i++) {
			s=s*i;
		}
		System.out.println("Factorial of "+num+" is: "+s);
}
}