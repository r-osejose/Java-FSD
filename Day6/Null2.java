package Day6;

import java.io.*;
 
class Null2
{
    public static void main (String[] args)
    {
        String ptr = null;
        try
        {
            if ("abc".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");           
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }
}
