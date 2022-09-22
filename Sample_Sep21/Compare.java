package Sample_Sep21;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		int p, q, m, n;  
		int row1,row2,col1,col2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the first matrix:");
        p = sc.nextInt();    
        System.out.print("Enter the number of columns in the first matrix:");
        q = sc.nextInt();   
        System.out.print("Enter the number of rows in the second matrix:");
        m = sc.nextInt();   
        System.out.print("Enter the number of columns in the second matrix:");
        n = sc.nextInt();   
        if (p == m && q == n) 
        {
            int a[][] = new int[p][q];    
            int b[][] = new int[m][n];    
            int c[][] = new int[m][n];    
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            System.out.println("First Matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            row1 = a.length;
            col1 = a[0].length;
            
            row2 = b.length;
            col2 = b[0].length;
            
            boolean flag = true ;
            
            //checking if dimension is equal
            if (row1 != row2 || col1!=col2) {
                System.out.println("Matrice Dimensions are not equal");
            }
            
            //checking elements in matrix are equal
            else {
                for (int i=0; i<row1 ; i++) {
                    for (int j=0; j<col1 ; j++) {
                        if (a[i][j] != b[i][j]) {
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (flag) {
                System.out.println("Matrices are equal");
            }
            else {
                System.out.println("Matrices are not equal");
            }
	}

	}
}
