package Day4;

import java.util.Scanner;

public class p4gm4 {

	public static void main(String[] args) {
		int n,s=0,p=1;
		int a[] = new int[20];
		System.out.println("Number of integers needed:");
		Scanner scan = new Scanner(System.in);
		n= scan.nextInt();
		System.out.print("Enter "+n+" integers : ");
		for(int i=0;i<n;i++) {
			Scanner sca = new Scanner(System.in);
			 a[i] = scan.nextInt();
		}
		int small, large;
		large=small=a[0];
		for(int j=0;j<n;j++) {
			if(a[j]>large) {
				large=a[j];
			}
			if(a[j]<small) {
				small =a[j];
			}
		}
		System.out.println("LARGEST: "+large);
		System.out.println("SMALLEST: "+small);

		}}