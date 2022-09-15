package Day2;

import java.util.Scanner;

public class MulitiTable {

	public static void main(String[] args) {
		System.out.println("Multiplication Table");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number upto which multiplication table is needed:");
		int n = scan.nextInt();
		{		System.out.println("Table of 24");
		for(int i=1;i<=n;i++) {
			int a= 24*i;
			System.out.println("24 * " +i+ "=" +a);
		}
		System.out.println();
		System.out.println("Table of 50");
		for(int z=1;z<=n;z++) {
			int b= 50*z;
			System.out.println("50 * " +z+ "=" +b);
		}
			System.out.println();
			System.out.println("Table of 29");
			for(int j=1;j<=n;j++) {
				int c= 29*j;
				System.out.println("29 * " +j+ "=" +c);
			
		}}
		}
	}
