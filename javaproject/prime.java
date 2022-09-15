package javaproject;

import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		int count;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		System.out.println("Prime Numbers from 0 to " +n+ " are:");
		for(int i=2;i<=n;i++)
			{	count=0;
				for(int j=2;j<i/2;j++)	
					{if(i%j==0){
						count=1;
						break;
					}}
				if(count==0)
					{System.out.print(+i+" ");}}
	}}

