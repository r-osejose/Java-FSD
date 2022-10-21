package mock_Day3;

import java.util.Scanner;
public class Text2 {

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            System.out.println("Enter numbers of players");
            int n=sc.nextInt();
            int l[]=new int[n];
            int r[]=new int[n];
            int an;
            System.out.println("Enter starting times");
            for(int i=0;i<n;i++)
            {
                l[i]=sc.nextInt();
            }
            System.out.println("Enter ending times");
            for(int i=0;i<n;i++)
            {
                r[i]=sc.nextInt();
            }
            System.out.println("Available slots are:");
            for(int i=0;i<n;i++)
            {
                if(i!=n-1)
                {
                    
                if(r[i]!=l[i+1])
                {                    
                    System.out.print("["+r[i]+","+l[i+1]+"]");
                }
                else
                    System.out.print("["+-1+","+-1+"]");
                }
                else
                    System.out.println("["+r[i]+","+100000+"]");
                }
   }
}
