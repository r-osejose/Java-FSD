package Sample_Sep21;

import java.util.Scanner;

public class RowColSum {
		int sumRow,sumCol,rows,cols,p,q;
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows in the first matrix:");
	        p = sc.nextInt();    
	        System.out.print("Enter the number of columns in the first matrix:");
	        q = sc.nextInt();  
	 rows = a.length;    
     cols = a[0].length;    
         
         
     for(int i = 0; i < rows; i++){    
         sumRow = 0;    
         for(int j = 0; j < cols; j++){    
           sumRow = sumRow + a[i][j];    
         }    
         System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
     }
     for(int i = 0; i < cols; i++){    
         sumCol = 0;    
         for(int j = 0; j < rows; j++){    
           sumCol = sumCol + a[j][i];    
         }    
         System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
     }    
 }    



}
}
