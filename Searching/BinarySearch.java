package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,8,9,11,15};
		int Search;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be searched:");
	   Search = sc.nextInt();
		int low=0;
		int high=a.length-1;
		int mid=(low+high)/2;
		
		while(low<=high) {
			if(a[mid]==Search) {
				System.out.println("Element "+Search+" is present. Index position is "+mid);
				break;
			}
			else if(a[mid]<Search) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			mid=(low+high)/2;
			if(low>high) {
				System.out.println("Element "+Search+" not found");
			}
		}
		
	}}


