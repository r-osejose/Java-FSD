package javaproject;
import java.util.Scanner;
public class vote {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the age : ");
	int num = scan.nextInt();
	
	if (num>18) {
		System.out.println("Eligible to vote");
	}
	else {
		System.out.println("Not Eligible to vote");
	}
	
}
}
