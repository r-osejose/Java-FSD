package Sample7_Sep20;
abstract class Parent
{
    public abstract void message() ;

}
class First extends Parent
{
    public void message()
    {
        System.out.println("This is first");
    }
}
class Second extends Parent
{
    public void message()
    {
        System.out.println("This is second");
    }
}


public class Pgm8 {

    public static void main(String[] args) {
        First f=new First();
        f.message();
        Second s=new Second();
        s.message();

    }

}