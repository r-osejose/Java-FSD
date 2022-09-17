package Interface;

interface Manic{
    public void pro();
}

public class Lamba {
   public static void main(String[] args) {
        int a=5;
        Manic m=()->{
        System.out.println("Number "+a);    
        };
        m.pro();
   }
}