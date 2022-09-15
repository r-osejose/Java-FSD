package Sorting;
import java.util.Scanner;

public class BubbleSort {
  public static void main(String []args) {
    int i,j,temp,n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Bubble Sort");
System.out.println("Enter the limit of the numbers:");
    n = sc.nextInt();
 
    int a[] = new int[n];
 
    System.out.println("Enter numbers: ");
    for (i = 0; i <n; i++) 
      a[i] = sc.nextInt();
 
    for (i = 0; i < ( n - 1 ); i++) {
      for (j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j+1]) //swap the elements if first one is greater than second
        {
           temp = a[j];
           a[j] = a[j+1];
           a[j+1] = temp;
        }
      }
    }
 
    System.out.println("Sorted list");
    for (i = 0; i < n; i++) 
      System.out.println(a[i]);
  }
}