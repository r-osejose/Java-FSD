package Day4;

import java.util.Scanner;

public class p4gm {

	public static void main(String[] args) {
		int n,s=0;
		int a[] = new int[20];
		System.out.print("Enter 10 integers : ");
		for(int i=0;i<10;i++) {
			Scanner scan = new Scanner(System.in);
			 a[i] = scan.nextInt();
			 s=s+a[i];
		}
		System.out.println("Sum  : "+s);
	}
}