package Searching;

import java.util.Scanner;

public class LinearSearch{
	 public static void main(String []args) {
		    int i,j,n,m;
		    int flag=0;
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Linear Search");
		System.out.println("Enter the value:");
		    n = sc.nextInt();
		 
		    int a[] = new int[n];
		    System.out.println("Enter numbers: ");
		    for (i = 0; i <n; i++) 
		      a[i] = sc.nextInt();
	System.out.println("Search Element:");
	m=sc.nextInt();
	for(j=0;j<a.length;j++) {
		if(a[j]==m)
		{
		 flag=1;
	}}
	if(flag==1) {
		System.out.println("The Index Position is "+j);}
	else {
		System.out.println("Item not found");
	}
	}
	
}