import java.util.*;




public class ArrayException {
    public String getpricedetails() {
    int n;
        System.out.println("Enter the limit");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int k=0;k<n;k++)
        {
            a[k]=s.nextInt();
        }
         
         try
         {
             System.out.println("Enter the index");
         int m=s.nextInt();
         
        return("The array element is:"+a[m]);
          }
         catch (ArrayIndexOutOfBoundsException e)
         {
                return("The array index out of range");
             }
         catch (InputMismatchException e)
         {
                return("Input is not in the correct format");
             }}

   public static void main(String[] args) {
        ArrayException b= new ArrayException();
        System.out.println(b.getpricedetails());          
         }
         
    }