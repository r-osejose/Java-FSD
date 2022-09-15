package javaproject;
import java.util.Scanner;
public class greatestnum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		int num1 = scan.nextInt();
		System.out.println("Enter the 2nd number : ");
		int num2 = scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+"is the greatest number");}
		else if(num1==num2) {
			System.out.println("Both are equal");}
		else {
			System.out.println(num2+"is the greatest number");
		}
	}
}