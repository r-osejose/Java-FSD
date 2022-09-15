package Day4;

import java.util.Scanner;

public class p4gm2 {

	public static void main(String[] args) {
		int n;
		int a[] = new int[15];
		System.out.print("Enter 10 integers : ");
		for(int i=0;i<10;i++) {
			Scanner scan = new Scanner(System.in);
			 a[i] = scan.nextInt();
		}
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int flag=0;
		for(int j=0;j<10;j++) {
			
	
		if( a[j]== n) {
			flag = 0;
			break;
		}
		else
			flag = 1;
	}
	if(flag ==0) {
	System.out.println("Number is in array");}
	else {
		System.out.println("Number is not in array");

	}
}}